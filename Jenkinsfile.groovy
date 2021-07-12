pipeline {
    agent any
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')
        }
    
       stage('build') {
         bat 'python hello.py'
         bat 'python del_buil_his.py'
       }
}
       
