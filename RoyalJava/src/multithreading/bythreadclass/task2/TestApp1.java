package multithreading.bythreadclass.task2;

public class TestApp1 {

	public static void main(String[] args) {
		
		Table resource = new Table();
		
		MyThread1 t1 = new MyThread1(resource);
		MyThread1 t2 = new MyThread1(resource);
		MyThread1 t3 = new MyThread1(resource);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
