pipeline {
    agent any
    
    stages {
        
        stage('Compile stage')
            
        	 steps {
        	 bat 'maven clean install'
 	        	clean 
 	        
 	        }
 	    stage('Testing stage')
 	        
 	        steps ('Testing stage'){
 	            bat 'Testing stage'
 	              }

 	    
		 stage
 	        
 	        steps ('Deployement stage'){
 	           bat 'Deployment stage'
 	              

 	    }
     		       
            
        }

}