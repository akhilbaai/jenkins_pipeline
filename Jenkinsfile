node {
    // Git checkout before load source the file
    checkout scm

    def rootDir = pwd()
    println("Current Directory: " + rootDir)

    // point to exact source file
    def example = load "${rootDir}/resources/Example.Groovy"

    example.exampleMethod()
    example.otherExampleMethod()
	example.shell("mkdir a")
}
