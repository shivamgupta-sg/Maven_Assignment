pipeline {
    agent any
    stages {
        stage('---clean---') {
            steps {
                sh "mvn clean"
            }
        }
        stage('---compile---') {
            steps {
                sh "mvn compile"
            }
            post {
                success {
                    echo 'Compiled SUccessfully'
                }
                failure {
                    echo 'Compiled failed'
                }
            }
        }
        stage('--test--') {
            steps {
                sh "mvn test"
            }
        }
        stage('--package--') {
            when {
                branch 'main'
            }
            steps {
                sh "mvn package"
            }
        }
    }
}
