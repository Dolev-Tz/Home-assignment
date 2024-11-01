pipelineJob('first-try') {
    description('A simple job that echoes Hello, World!')
    
    steps {
        stages {
            stage('Hello'){
                steps {
                    script {
                        echo "Hello, World!"
                    }
                }
            }
        }
    }
}
