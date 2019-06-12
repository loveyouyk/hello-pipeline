pipeline {
  agent any
  
  tools {
     maven 'mvn3.6.1'
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
