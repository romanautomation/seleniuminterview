package javalearning;

public class ConstructorDemo {

	
	
	
	
	
	public ConstructorDemo(){
		
		System.out.println("Default onstr");
	}
	
    private ConstructorDemo(int i){
		
    	System.out.println(i);
	}
    
   protected ConstructorDemo(int i, int j){
		
	   System.out.println(i+" "+j);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10);
		ConstructorDemo cd2 = new ConstructorDemo(10,20);
		
	}

}
