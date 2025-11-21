package Inheritance;

public class HierarchicalMainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Feathure of Son1 Class");
		hierarchicalsubclass1 S1= new hierarchicalsubclass1();
		S1.son1();
		S1.father();
		
		System.out.println("Feathure of Son2 Class");
		hierarchicalsubclass2 S2 = new hierarchicalsubclass2();
		S2.son2();
		S2.father();
		
		System.out.println("Feathure of Son3 Class");
		hierarchicalSubclass3 S3 = new hierarchicalSubclass3();
		S3.son3();
		S3.father();
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
