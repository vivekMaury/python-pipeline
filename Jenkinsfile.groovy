pipeline {
    agent any
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')
        }
     stages('First') {
            steps {
                echo 'Hello World'
            }
       stage('build') {
         bat 'python hello.py'
         bat 'python del_buil_his.py'
        }
     }
}
       
