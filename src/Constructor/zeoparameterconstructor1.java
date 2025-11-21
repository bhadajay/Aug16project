package Constructor;

public class zeoparameterconstructor1 {
	
	int a;
	int b;
	
	zeoparameterconstructor1()
	{
		a=10;
		b=2;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		zeoparameterconstructor1 Z2=new zeoparameterconstructor1();
		Z2.sub();
		Z2.div();
	
	}
	
	
	public void sub() {
		
		System.out.println(a-b);
	}
	
	public void div()
	{
		System.out.println(a/b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
