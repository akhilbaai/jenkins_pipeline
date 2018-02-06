pipeline {
	agent any
	
	environment {
        e = ""
		root_dir = ""
    }
	
	stages {
	    stage('Init') {
            steps {
				// Git checkout before load source the file
				checkout scm
				echo "git check-out success"
				script {
					def rootDir = pwd()
					root_dir = rootDir
				}
			}
		}
        stage('Build') {
            steps {
				echo "Build"
				script {
					bat "make -C ${root_dir} project1"
				}
            }
        }
        stage('Test') {
            steps {
				echo "Test"
				script {
					bat "make -C ${root_dir} project2"
				}
            }
        }
        stage('Deploy') {
            steps {
				echo "Deploy"
				script {
					bat "make -C ${root_dir} project3"
				}
            }
        }
    }
}
