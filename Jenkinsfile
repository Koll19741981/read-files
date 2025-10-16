pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'cloner le repertoire' 
                git branch: 'master', url: 'https://github.com/Koll19741981/read-files.git'
            }   
        }
        
        
         stage('test') {
            steps {
                sh 'ls -al'
                sh 'cat server.csv'
                
            }
        }
        
        
        stage('deploy') {
            steps {
                echo 'connect au serveur'
                echo 'dowload configuration'
                 echo 'deploy project'
            }
        }
    }
}