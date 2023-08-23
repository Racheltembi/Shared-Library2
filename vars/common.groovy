def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
  else if ("$(stagename)" == "Authorization") {
        timeout('time: 48, unit: 'Hours') {
        // some block
        imput message: 'Approve or Decline'
    }
  }              
                
