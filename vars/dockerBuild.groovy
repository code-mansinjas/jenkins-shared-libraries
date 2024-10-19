def call(String ProjectName, String ImageTag, String DockerHubUser){
    echo "Docker Build Started =========================>>>>>>>>>>>>>>>>>>>>>>>>>> "
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
    echo "Docker Build Ended <<<<<<<<<<<<<<<<<<<<<<<<<<<<<========================== "
}