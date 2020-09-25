pipeline {
    agent any
    
    stages {
        
        stage{
        	 
        	 steps ('Compile stage'){
 	           withMaven( maven : 'maven-3.6.3')
 	           sh 'clean compile' 
 	        }
 	    stage{
 	        
 	        steps ('Testing stage'){
 	           withMaven( maven : 'maven-3.6.3')
 	           sh 'clean compile' 
 	              }

 	    }
		 stage{
 	        
 	        steps ('Deployement stage'){
 	           withMaven( maven : 'maven-3.6.3')
 	           sh 'clean compile' 
 	              }

 	    }
     		       
            
        }

    }
}