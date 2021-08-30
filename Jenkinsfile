pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Build job Started'
		bat 'python aa/a/b/c/build.py'
		echo 'python file successfully called'
		
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
