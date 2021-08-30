pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Build job Started'
		bat 'python aa/a/b/c/build.py'
		
            }
        }
        stage('Build_BL') {
            steps {
                echo 'Build BootLoader started'
		echo 'python build_BL.py'
		
		
            }
        }
    }
}
