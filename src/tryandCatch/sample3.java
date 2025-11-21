package tryandCatch;

public class sample3 {
	
	
	public static void main(String[] args) 
	
	{
		String a ="Jayesh";
		
		
		try 
		{
			System.out.println(a.charAt(0));
		}
		
		catch(StringIndexOutOfBoundsException g)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		finally
		{
			System.out.println("Run important code ");
		}
		
		
		System.out.println("Handled all issues");
	}

}
