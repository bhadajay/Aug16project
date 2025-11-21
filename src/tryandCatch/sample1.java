package tryandCatch;

public class sample1{

	public static void main(String[] args) 
	{
	
		int a= 10;
		int b=0;
		
		try 
		{
		
			System.out.println(a/b);		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		
		finally
		{
			System.out.println("Finally code executed");
			
		}
		
		
		
		
		System.out.println("Jayesh Called ");
		
		
		
	}
	
	
}
