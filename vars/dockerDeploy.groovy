def call(){
    echo "Docker Deploy Started =========================>>>>>>>>>>>>>>>>>>>>>>>>>> "
    sh "docker-compose down && docker-compose up"
    echo "Docker Deploy Ended <<<<<<<<<<<<<<<<<<<<<<<<<<<<<========================== "
}