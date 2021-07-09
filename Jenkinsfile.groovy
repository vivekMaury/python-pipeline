node() {
  stage('checkout') {
    deleteDir()
    checkout scm
  }
  stage('build') {
    bat "behave -i test.feature --junit"
  }
  stage('publish') {
    junit 'reports/*.xml'
  }
}
