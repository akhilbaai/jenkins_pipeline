node {	
    stages {
	    stage('Init') {
            steps {
				// Git checkout before load source the file
				checkout scm

				def rootDir = pwd()
				println("Current Directory: " + rootDir)

				// point to exact source file
				def example = load "${rootDir}/resources/Example.Groovy"
			}
		}
        stage('Build') {
            steps {
                example.shell("make project1")
            }
        }
        stage('Test') {
            steps {
                example.shell("make project2")
            }
        }
        stage('Deploy') {
            steps {
                example.shell("make project3")
            }
        }
    }
}
