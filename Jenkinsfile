pipeline {

	agent any 
	tools {
	    maven 'Maven'
	}
	
	stages {
      
      stage("test"){
          
          steps {
                sh "mvn clean test"
          }
      }
      

      stage("build"){

          

          steps {
              sh "mvn package -DskipTests"
          }
          
          post {
              
              success {
              	  jacoco()
              }
          }
      }

  }
}