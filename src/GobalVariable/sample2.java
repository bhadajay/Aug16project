package GobalVariable;

public class sample2 {
	
	
	
	
	
	static int b = 100 ;
	static int c =200;
	
	public static void main(String[] args) {
		
		M1();
		sample2 S2 = new sample2();
		S2.M2();
		
	}
	
	public static void M1()
	{
		System.out.println(b);
		System.out.println(c);
	}
	
	public void M2()
	{
		System.out.println(b);
		System.out.println(c);
	}
	
	

}
