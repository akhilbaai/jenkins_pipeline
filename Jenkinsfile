pipeline {
	agent any
	
	stages {
	    stage('Init') {
            steps {
				// Git checkout before load source the file
				checkout scm
				echo "git check-out success"
				
				rootDir = pwd()
				echo "Current Directory: " + rootDir

				// point to exact source file
				//def example = load "${rootDir}/resources/Example.Groovy"
			}
		}
        stage('Build') {
            steps {
                //example.shell("make project1")
				echo "Build"
            }
        }
        stage('Test') {
            steps {
                //example.shell("make project2")
				echo "Test"
            }
        }
        stage('Deploy') {
            steps {
                // example.shell("make project3")
				echo "Deploy"
            }
        }
    }
}
