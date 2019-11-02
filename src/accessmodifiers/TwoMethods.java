package accessmodifiers;

public class TwoMethods {

	
	
	
	protected static int i=25;
	
	
	static void test(){
	
//		int i=10;
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoMethods ms = new TwoMethods();
		
		ms.test();
//		test();
		
	}

}
