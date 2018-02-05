pipeline {
	stages {
	    stage('Init') {
            node(node1) {
				// Git checkout before load source the file
				checkout scm

				def rootDir = pwd()
				println("Current Directory: " + rootDir)

				// point to exact source file
				def example = load "${rootDir}/resources/Example.Groovy"
			}
		}
        stage('Build') {
            node(node2) {
                example.shell("make project1")
            }
        }
        stage('Test') {
            node(node3) {
                example.shell("make project2")
            }
        }
        stage('Deploy') {
            node(node3) {
                example.shell("make project3")
            }
        }
    }
}
