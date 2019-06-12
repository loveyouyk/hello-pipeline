pipeline {
  agent any
  
  tools {
     maven ''
  }
  stages {
    stage("Build") {
	  steps {
	    sh "mvn clean package spring-boot:repackage"
		sh "printevn"
	    echo  "hello world!"
	  }
	}
  }
}