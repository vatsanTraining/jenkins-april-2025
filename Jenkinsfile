#!/bin/bash
pipeline {
  agent any
 tools {
        maven "maven"
    }
  stages {
    stage('Checkout') {
      steps {
        // Checkout the source code from your Git repository
        git 'https://github.com/vatsanTraining/jenkins-april-2025.git' 
      }
    }

    stage('Build') {
      steps {
        // Run the Maven build commands
        dir('jenkins-april-2025'){
        sh 'mvn -B -DskipTests clean package'
        }// Clean, package, and install the artifact
      }
    }
    
    stage('Test') {
      steps {
        // Run the Maven tests if needed
        dir('jenkins-april-2025'){
        sh 'mvn -B -DskipTests=false test'
        }
      }
    }
  }
    
  

 
}


