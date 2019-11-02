package multithreading;







public class UsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj1= new Runnable()
				{
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
				};
		
		Runnable obj2= new Runnable(){
			
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
			
				
				};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
	}

}
