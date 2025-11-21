package tryandCatch;

public class sample4 
{

	
	public static void main(String[] args)
	{
	
		String a="Jayesh";
		
		String [] ar= {"Jayesh", "Snadesh", "Mahesh", "Ashay"};
		
		int c=20;
		int d= 0;
		
		try
		{
			System.out.println(a.charAt(9));
		}
		catch(StringIndexOutOfBoundsException h)
		{
			System.out.println("StringIndexOutOfBounds Exception j");
		}
		
		try
		{
			System.out.println(ar[9]);
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		
		try
		{
			System.out.println(c/d);
		}
		catch(ArithmeticException G)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		
		finally
		{
			System.out.println("Run this code");
		}
		
		System.out.println("Hello");
		
		
		
		
		
		
		
		
	}
}
