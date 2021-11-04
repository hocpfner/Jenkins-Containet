def resultado = new StringBuilder() //(1)
def error     = new StringBuilder()

def comando = "docker run -p 8080:8080 -p 50000:50000 -d -v jenkins_home:/var/jenkins_home  jenkins/jenkins:lts".execute() //(2)
comando.consumeProcessOutput(resultado, error) //(3)
comando.waitForOrKill(1000) //(4)

if (!error.toString().equals("")) //(5)
    println "Error al ejecutar el comando"
else{
    println "Ejecutado correctamente"
    println resultado //(6)

}