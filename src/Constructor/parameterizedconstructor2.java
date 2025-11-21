package Constructor;

public class parameterizedconstructor2 {
	
	int num1;
	int num2;
	
	parameterizedconstructor2(int a ,int b)
	{
		num1=a;
		num2=b;
		
	}
	public static void main(String[] args) {
		parameterizedconstructor2 P2=new parameterizedconstructor2(200 ,200);
		parameterizedconstructor2 P3=new parameterizedconstructor2(300,100);
	    parameterizedconstructor2 P4 = new parameterizedconstructor2(20,10);
	    parameterizedconstructor2 P5= new parameterizedconstructor2(500,150);
	    P2.add();
		P3.mult();
		P4.sub();
		P5.div();	
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public void div()
	{
		System.out.println(num1/num2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
