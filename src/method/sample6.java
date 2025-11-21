package method;

public class sample6 {
	
	
	
	public static void main(String[] args) {
		
		jay1();
		
		sample6 J1= new sample6();
		J1.jay2();
		
		sample7.jay3();
		
		sample7 J2 = new sample7();
		
		J2.jay4();
		
		
	}
	
	
	public static void jay1()
	{
		System.out.println("Jayesh Calling");
	}
	
	public void jay2()
	{
		System.out.println("Jayesh Non static method calling");
	}
	

}
