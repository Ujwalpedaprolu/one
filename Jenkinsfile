@Library('devops-shared-library') _
pipeline {
    agent any
    tools {
        maven "mymaven"
    }
    stages {
        stage ("Code") {
            steps {
                checkoutCode()
            }
        }
        stage ("Build") {
            steps {
                mavenBuild()
            }
        }
        stage ("image")
            steps {
                dockerBuild("ujjvalpedaprolu/sl", "${BUILD_NUMBER}")
            }
        }
        stage ("push") {
            steps {
                script {
                    def image_name = "ujjvalpedaprolu/sl"
                    def tag = "(env.BUILD_NUMBER)"
                    dockerBuild(image_name, tag)
                }
            }
        }   
    }
}
