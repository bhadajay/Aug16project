package Constructor;

public class zeoparameterconstructor2 {
	
	int a ;
	int b;
	
	
	
	zeoparameterconstructor2()
	{
		
		a=20;
		b=30;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		zeoparameterconstructor2 Z3= new zeoparameterconstructor2();
		Z3.add();
		Z3.mul();
	}
	
	
	
	
	public void add()
	{
		
		System.out.println("Addition" + (a+b));
	}
	
	public void mul()
	{
		System.out.println("Multiplication" + a*b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
