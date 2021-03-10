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
            git 'https://github.com/sanjay037/Calculator'
            }
        }
    stage('Clean Target files') {
        steps {
            sh 'mvn clean'
            }
        }
    stage('Build excutable jar') {
        steps {
            sh 'mvn install'
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
                dockerImage.push()
                        }
                    }
               }
        }
    }
}