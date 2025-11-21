package GobalVariable;

public class sample1 {

         static int a = 10 ; // Static Global variable from same class
         
         public static void main(String[] args) {
			
        	 m1();
        	 
        	 sample1 S1= new sample1();
        	 S1.m2();
        	 
          	 
		}
     
         public static void m1()
         {
        	 System.out.println(a);
         }
         
         public void m2()
         {
        	 System.out.println(a);
        	 
         }
         
         
	
	
	
	
	
	
}
