package multithreading.bythreadclass;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {

		for (int i = 1; i <= 3; i++) {
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				
				e.printStackTrace();
				
			}
			
			System.out.println("I : " + i + " - " + Thread.currentThread().getName());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
//		t1.run();
//		t2.run();
//		t3.run();
		
//		out if called .run() Method : 
//		I : 1 - main
//		I : 2 - main
//		I : 3 - main
//		I : 1 - main
//		I : 2 - main
//		I : 3 - main
//		I : 1 - main
//		I : 2 - main
//		I : 3 - main

		
		//we can set Priority of thread :
		
		t1.setPriority(MAX_PRIORITY);// MAX_PRIORITY = 10
		t2.setPriority(MIN_PRIORITY);// MIN_PRIORITY = 1
		t3.setPriority(NORM_PRIORITY);// NORM_PRIORITY = 5
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
