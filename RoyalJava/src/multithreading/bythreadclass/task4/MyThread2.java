package multithreading.bythreadclass.task4;

public class MyThread2 extends Thread {

	Prime resource = null;

	public MyThread2(Prime resource) {

		this.resource = resource;

	}

	@Override
	public void run() {

		for (int i = 201; i <= 400; i++) {

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
