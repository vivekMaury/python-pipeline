pipeline {
  agent {label "linux"}
  
    options {
      buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '10', numToKeepStr: '10')
        }
  stage('build') {
    bat 'python hello.py'
    bat 'python del_buil_his.py'
  }
}
