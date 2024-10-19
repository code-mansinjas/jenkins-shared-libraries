def call(String GitUrl, String GitBranch){
    echo "Code Cloning Started =========================>>>>>>>>>>>>>>>>>>>>>>>>>> "
    git url: "${GitUrl}", branch : "${GitBranch}"
    echo "Code Cloning Ended <<<<<<<<<<<<<<<<<<<<<<<<<<<<<========================== "
}