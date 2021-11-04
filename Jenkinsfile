pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    lib = load "lib01.groovy"
                }
            }
        }
        stage("Docker") {
            steps {
                script {
                    lib.comando.execute()
                }
            }
        }
    }
}