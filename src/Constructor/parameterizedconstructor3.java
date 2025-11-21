package Constructor;

public class parameterizedconstructor3 {
	
	String a ;
	String b;
	String c;
	
	
	parameterizedconstructor3(String x)
	{
	         a=x;
	        b=x;
	        c=x;
	        
	         
		
	}
	
	
	
	public static void main(String[] args) {
		
		parameterizedconstructor3 N1= new parameterizedconstructor3("Jayesh");
		N1.FName();
		
		parameterizedconstructor3 N2= new parameterizedconstructor3("Dilip");
		N2.MName();
		
		parameterizedconstructor3 N3= new parameterizedconstructor3("Bhadage");
		N3.LName();
	}
	
	
	
	public void FName()
	{
		System.out.println(a);
	}
	
	public void MName()
	{
		System.out.println(b);
	}
	
	public void LName()
	{
		System.out.println(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
