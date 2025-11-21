package Constructor;

public class zeoparameterconstructor {

	int num1;
	
	int num2;
	
	
	zeoparameterconstructor()
	{
		num1=10;
		num2=20;
	}
	
	
	public static void main(String[] args) {
		
		zeoparameterconstructor Z1=new zeoparameterconstructor();
		Z1.add();
		Z1.mult();
		
	}
	
	
	public void add() {
		
		System.out.println(num1+num2);

	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	
	
	
	
}
