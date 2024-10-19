def call(){
    echo "Docker Deploy Started =========================>>>>>>>>>>>>>>>>>>>>>>>>>> "
    sh "docker-compose down && docker-compose up -d"
    echo "Docker Deploy Ended <<<<<<<<<<<<<<<<<<<<<<<<<<<<<========================== "
}