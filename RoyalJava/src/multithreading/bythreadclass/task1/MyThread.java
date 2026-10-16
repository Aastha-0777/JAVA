package multithreading.bythreadclass.task1;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Hello I am Thread, My Name is->" + Thread.currentThread().getName() + " -->" + Thread.currentThread().getId());
		
	}
	
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		
		//start method do parallel execution while run method do secqential execution
//		t1.start(); --> it will throw exception
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
