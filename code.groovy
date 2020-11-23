pipeline {
    stages {
        stage('build') {
            steps {
                echo "building jar file"
            }
            steps
        }
        stage('code-review') {
            steps {
                echo "reviwing code"
            }
            steps
        }
    }   
        stage('Deploy-stage') {
            steps {
                echo "deploying to stage"
            }
            steps
        }
        stage('Deploy-Prod') {
            steps {
                echo "deploying to prod"
            }
            
        }
    }    

}