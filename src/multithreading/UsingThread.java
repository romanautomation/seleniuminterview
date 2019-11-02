package multithreading;







class Hi1 extends Thread{
	
	public void run(){
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

class Hello1 extends Thread{
	
	public void run(){
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
public class UsingThread {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi1 obj1= new Hi1();
		
		Hello1 obj2= new Hello1();
		
		obj1.start();
		try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
		obj2.start();
	}

}
