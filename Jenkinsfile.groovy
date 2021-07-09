node() {
  stage('checkout') {
    deleteDir()
    checkout scm
  }
  stage('build') {
    bat 'python hello.py'
  }
  stage('publish') {
    junit 'reports/*.xml'
  }
}
