pipeline {
  agent any
  
  tools {
     maven 'mvn3.6.1'
  }
  stages {
    stage("Build") {
	  steps {
	    sh "mvn clean test pmd:pmd"
	    echo  "hello world!"
	  }
	}
  }
  
  post {
    always {
	  pmd(canRunOnFailed: true,pattern:'**/target/pmd.xml')
	  junit testResults: '**/target/surefire-reports/*.xml'
	}
  }
}
