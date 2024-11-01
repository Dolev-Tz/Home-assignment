job('HelloWorldJob') {
    description('A simple job that echoes Hello World')
    steps {
        batchfile('echo "Hello World"')     
    }
}
