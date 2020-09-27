pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'mvn -version'
              
                    bat 'mvn clean install'
               
              
                    cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "cucumber.json",
                    jsonReportDirectory: 'target'
               
            }
        }
        stage('Test') {
            steps {
                echo 'Testing stage'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deployment stage'
            }
        }
        stage('Release') {
            steps {
                echo 'deployment stage'
            }
        }
    }
}
