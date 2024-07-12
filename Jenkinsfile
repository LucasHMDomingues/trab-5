pipeline {
    agent any

    tools {
        jdk 'jdk-22' // Substitua pelo nome exato da instalação JDK configurada no Jenkins
        maven 'M3' // Certifique-se de que "M3" está configurado no Jenkins
    }

    stages {
        stage('Build') {
            steps {
                // recuperar código git
                git branch: 'main', url: 'https://github.com/LucasHMDomingues/trab-5.git'

                // Run Maven
                //sh "mvn -Dmaven.test.failure.ignore=true clean package" comando para linux
                bat "mvn -Dmaven.test.failure.ignore=true clean package"

            }

            post {
                success {
                    junit '**/meu-app/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'meu-app/target/*.jar'
                }
            }
        }
    }
}