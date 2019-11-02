package staticDemo;








class test2{
	
	public void outsider(){
		System.out.println(NormalStaticVariableWithClass.i);
	}
}

public class NormalStaticVariableWithClass {

	
	
	static int i = 10; //static variable is a class level variable, we can not declare variable as static in main or another function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test2 tt = new test2();
		
		test();
		tt.outsider();
		
		
		
	}
	
	
	public static void test(){
		
		System.out.println(i);
	}

	
}
