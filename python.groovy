job('hello-world') {
    description('A simple job that echoes Hello, World!')
    
    steps {
        batch('echo "Hello, World!"')
    }
}
