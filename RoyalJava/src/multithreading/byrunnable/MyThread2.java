package multithreading.byrunnable;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i + "----" + Thread.currentThread().getName() + "----" + Thread.currentThread().getId());
			
		}
		
	}
	

	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread3.setName("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
