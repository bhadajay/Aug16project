package method;

public class sample1 {

	
	
	public static void main(String[] args) {
		
		m1();
		m2();
		m1();
		
		sample1 s1 = new sample1();
		s1.m3();
		
		sample2.m4();
		
		sample2 s2 = new sample2();
		s2.m5();	
		
		sample2 s3= new sample2();
		s3.m6();
		
	}
	
	public static void m1() {
			
		System.out.println("Method1 calling");
		
	}
	
	public static void m2()
	{
		System.out.println("Method2 Calling");
	}
	
	public void m3()
	
	{
		System.out.println("Method3 calling");
	}
	
	
}
