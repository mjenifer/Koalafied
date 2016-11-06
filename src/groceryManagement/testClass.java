package groceryManagement;

public class testClass {
	
	public static void main(String args[]){
		
		
		//default constructor test
		item item1 = new item();
		item item2 = new item("Apple", 2.00, 1.45, 1.37, 2017, 8, 16 );
		
		System.out.println(item1);
		System.out.println(item2);
		
	}
	
	
	

}
