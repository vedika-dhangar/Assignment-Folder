class PrintPattern15{
      		public static void main(String[] args)
		{
		  for(int i=1; i<=10; i++){
		      for(int j=1; j<=i; j++){
                    	System.out.print(i +"*");
                        if(i>5){
                      
			  for(int i=5; i<=10; i--){
		             for(int j=1; j<=i; j++){
                    	     System.out.print(i +"*"); 
                            }
                         System.out.println();
			}
  		 }
	     }	
 		
		System.out.println();
	}
      }
 }