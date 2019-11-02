package multithreading;







public class UsingLambdaExpression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Thread t1 = new Thread(() ->
		{
		for(int i=1;i<=5;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		});
		
		
		Thread t2 = new Thread(()->
		{
			for(int i=1;i<=5;i++){
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
			
			});
		
		
		t1.start();
		try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
	}

}
