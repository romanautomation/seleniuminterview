package multithreading;







class Hi{
	
	public void show(){
		for(int i=1;i<=5;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello{
	
	public void show(){
		for(int i=1;i<=5;i++){
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SimpleClass {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi obj1= new Hi();
		
		Hello obj2= new Hello();
		
		obj1.show();
		obj2.show();
		
	}

}
