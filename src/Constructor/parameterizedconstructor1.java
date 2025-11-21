package Constructor;

public class parameterizedconstructor1 {
   
	int num1;
	int num2;
	
	
	parameterizedconstructor1(int a , int b)
	{
		 num1=a;
		 num2=b;
		 
		
	}
	
	public static void main(String[] args) {
		
		parameterizedconstructor1 P1=new parameterizedconstructor1(5,10);
		
		P1.add();
		P1.mult();
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
