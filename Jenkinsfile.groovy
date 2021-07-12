pipeline {
    agent any
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')
        }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
         stage('Build') {
            steps {
                echo 'Building'
                bat 'python hello.py'
                bat 'python del_buil_his.py'
            }       
    }
}
