job('first-try') {
    description('A simple job that echoes Hello, World!')
    
    steps {
        shell ('echo "Hello, World!"')
    }
}
