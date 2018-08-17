pipeline {
     agent any
     stages {
        stage('Build'){
           steps{
             sh 'ant war'
             sh 'docker build . -t tomcatwebapp:2.0'
           }
        }
     }
}
