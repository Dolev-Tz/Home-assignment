pipelineJob("frestyle_python") {

  definition {
           cps {
             script('''
                 pipeline {
                    agent any
                    stages {
                        stage('Hello') {
                            steps {
                                echo "Hello!! python"
                            }
                         }
                      }
                   }
              '''.stripIndent())
       sandbox()
          }
      }
  }
