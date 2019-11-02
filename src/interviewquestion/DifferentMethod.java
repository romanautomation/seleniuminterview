package interviewquestion;

public class DifferentMethod {

	
	
	
	public static void init(String a){
		System.out.println("First init");
		
	}
	
	
	public static void init(int b){
		System.out.println("Second init");
	}
	
	public static void init(Object o){
		System.out.println("Third init");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		init(null);
	}

}
