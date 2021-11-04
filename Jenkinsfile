pipeline {
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
                    lib.buildDocker()
                }
            }
        }
    }
}