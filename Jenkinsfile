pipeline {
    agent any
    
    stages {
        
        stage('Compile stage')
            
        	 steps {
        	 sh 'clean'
 	        	clean 
 	        
 	        }
 	    stage('Testing stage')
 	        
 	        steps ('Testing stage'){
 	            sh 'clean test'
 	              }

 	    
		 stage
 	        
 	        steps ('Deployement stage'){
 	           bat 'Deployment stage'
 	              

 	    }
     		       
            
        }

}