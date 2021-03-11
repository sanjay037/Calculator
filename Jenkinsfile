pipeline {
   environment { 
        registry = "sanjaysingireddy/devops-calculator" 
        registryCredential = 'dockerhub_id' 
        dockerImage = '' 
    }
agent any

stages {
    stage('Git clone') {
        steps {
            git 'https://github.com/sanjay037/Calculator.git'
            }
        }
    stage('Clean Target files and build excutable jar') {
        steps {
            sh 'mvn clean install'
            }
        }
    stage('Test') {
        steps {
            sh 'mvn test'
            }
        }
    stage('Building Docker image'){
        steps{
            script{
            dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
    stage('Push Docker image to dockerhub'){
        steps{
            script{
                docker.withRegistry('',registryCredential){ 
                dockerImage.push("latest")
                        }
                    }
               }
        }
    stage('Deploy on Node') {
      steps {
        script {
          step([
            $class: "RundeckNotifier",
            includeRundeckLogs: true,
            rundeckInstance: "Rundeck server",
            jobId: "d48b8c93-e523-4526-b437-96b4599c3dc8",
            shouldWaitForRundeckJob: true,
            shouldFailTheBuild: true,
            tailLog: true
          ])
        }
      }
    }
    }
}