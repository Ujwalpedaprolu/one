def call() {
    withDockerRegistry([credentialsId: 'dockerhub']) {
	sh "docker push $image_name:$tag"
    }
}
