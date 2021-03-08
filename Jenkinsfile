pipeline {
agent any

stages {
    stage('Git clone') {
        steps {
            git 'https://github.com/sanjay037/Calculator'
        }
    }
    stage('Clean') {
        steps {
            sh 'mvn clean'
            }
        }
    stage('Build') {
        steps {
            sh 'mvn install'
            }
        }
    stage('Test') {
        steps {
            sh 'mvn test'
            }
        }
    }
}