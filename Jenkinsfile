pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Build job Started'
		bat 'build.bat'
		
            }
        }
        stage('Build_BL') {
            steps {
                echo 'Build BootLoader started'
		bat 'build_BL.bat'
		python 'test.py'
		
            }
        }
    }
}
