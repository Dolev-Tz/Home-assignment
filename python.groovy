job('HelloWorldJob') {
    description('A simple job that echoes Hello World')
    steps {
        bat('echo "Hello World"')     
    }
}
