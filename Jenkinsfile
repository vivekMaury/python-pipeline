pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Build job Started'
		bat 'python build.py'
		
            }
        }
        stage('Build_BL') {
            steps {
                echo 'Build BootLoader started'
		bat 'python build_BL.py'
		
		
            }
        }
    }
}
