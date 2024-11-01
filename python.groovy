job('first-try') {
    description('A simple job that echoes Hello, World!')
    
    steps {
        pipeline {
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
}
