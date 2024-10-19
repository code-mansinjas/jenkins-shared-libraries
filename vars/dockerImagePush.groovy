def call(String CredentialsId, String ProjectName, String ImageTag, String UsernameVariable, String PasswordVariable ){
    echo "Pushing Image to Docker Hub Started =========================>>>>>>>>>>>>>>>>>>>>>>>>>> "
    withCredentials([usernamePassword(credentialsId:"${CredentialsId}", passwordVariable: "${PasswordVariable}", usernameVariable: "${UsernameVariable}")]){
        echo "Values ==>> ${env}"
        sh "docker login -u ${env["${UsernameVariable}"]} -p ${env["${PasswordVariable}"]}"
        sh "docker image tag ${ProjectName}:${ImageTag} ${env["${UsernameVariable}"]}/${ProjectName}:${ImageTag}"
        sh "docker push ${env["${UsernameVariable}"]}/${ProjectName}:${ImageTag}"
    }
    echo "Pushing Image to Docker Hub Ended <<<<<<<<<<<<<<<<<<<<<<<<<<<<<========================== "
}
