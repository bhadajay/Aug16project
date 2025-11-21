package LocalVariable;

public class sample1 {
	
	public static void main(String[] args) {
		
		m1();
		
		sample1 S1 = new sample1();
		
		S1.m2();
		
		
		sample2 S2 = new sample2();
		S2.m3();
			
	}
	
	public static void m1() {
		
		int a = 10;
		
		System.out.println(a);        // "Local Varibale of static methode
	}
	
	public void m2()
	{
		int b = 20 ;
		
		System.out.println(b); // "Local Variable of non static method"
	
	

}
}
