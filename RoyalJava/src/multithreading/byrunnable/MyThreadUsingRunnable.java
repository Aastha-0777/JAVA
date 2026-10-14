package multithreading.byrunnable;

public class MyThreadUsingRunnable implements Runnable{

	@Override
	public void run() {

		System.out.println("MyThread --run() : " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		
		MyThreadUsingRunnable t1 = new MyThreadUsingRunnable();
		MyThreadUsingRunnable t2 = new MyThreadUsingRunnable();
		MyThreadUsingRunnable t3 = new MyThreadUsingRunnable();
		
		//as we cannot call the start method of tread class
		//we have to separately make an obj of Thread class
		//and pass the class obj whose thread we want to make
		
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
