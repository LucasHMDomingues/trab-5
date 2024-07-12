pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // recuperar código git
                git branch: 'main', url: 'https://github.com/LucasHMDomingues/trab-5.git'

                // Run Maven
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
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