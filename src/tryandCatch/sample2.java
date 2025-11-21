package tryandCatch;

public class sample2 {
	
	public static void main(String[] args) 
	
	{
	
	String [] ar= {"Mahesh", "Jayesh", "Ashay", "Sandesh"};
	
	
	try
	{
		System.out.println(ar[9]);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String Exception Handled");
	}
	catch(ArrayIndexOutOfBoundsException b)
	{
		System.out.println("ArrayIndexOutOfBounds Exception Handled");
	}
	
	System.out.println("Jayesh Handled all the issues");
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
