def exampleMethod() {
    println("exampleMethod")
}

def otherExampleMethod() {
    println("otherExampleMethod")
}

def shell(cmd) {
    def proc = cmd.execute();
    proc.waitFor();
    println "Process exit code: ${proc.exitValue()}";
    println "Std Err: ${proc.err.text}";
    println "Std Out: ${proc.in.text}";
}

return this