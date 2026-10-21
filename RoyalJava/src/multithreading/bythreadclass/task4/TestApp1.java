package multithreading.bythreadclass.task4;

public class TestApp1 {

	public static void main(String[] args) {
		
		Prime resource = new Prime();
		
		MyThread1 t1 = new MyThread1(resource);
		MyThread2 t2 = new MyThread2(resource);
		MyThread3 t3 = new MyThread3(resource);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
			
	}
	
}
