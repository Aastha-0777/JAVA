package multithreading.bythreadclass.task5;

public class MyThread extends Thread{

	@Override
	public void run() {

		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("Hello I am a Daemon Thread!! --" + Thread.currentThread().getName());
			
		}else {
			
			for(int i = 1; i <= 10; i++) {
				
				System.out.println(7 + " * " + i + " = " + (7 * i) + " ---" + Thread.currentThread().getName());
				
			}
			
		}

	}
	
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
