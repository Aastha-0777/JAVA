package multithreading.bythreadclass.task4;

public class MyThread1 extends Thread{

	Prime resource = null;
	
	public MyThread1(Prime resource) {

		this.resource = resource;

	}
	
	@Override
	public void run() {

		synchronized (resource) {

			for (int i = 1; i <= 200; i++) {

				if ((resource.isPrime(i)) && i != 1) {

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName() + "----" + i);

				}

			}

		}
	
	}
	
}
