node() {
  stage('checkout') {
    deleteDir()
    checkout scm
  }
  stage('build') {
    bat 'python hello.py'
    bat 'python del_build_his.py'
  }
 }
