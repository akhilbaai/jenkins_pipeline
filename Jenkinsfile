pipeline {
	agent any
	
	stages {
	    stage('Init') {
            steps {
				// Git checkout before load source the file
				checkout scm
				echo "git check-out success"
				script {
					def rootDir = pwd()
					//echo "Current Directory: " + rootDir

					// point to exact source file
					def example = load "${rootDir}/resources/Example.Groovy"
				}
			}
		}
        stage('Build') {
            steps {
				echo "Build"
				script {
					example.shell("make project1")
				}
            }
        }
        stage('Test') {
            steps {
				echo "Test"
				script {
					example.shell("make project2")
				}
            }
        }
        stage('Deploy') {
            steps {
				echo "Deploy"
				script {
					example.shell("make project3")
				}
            }
        }
    }
}
