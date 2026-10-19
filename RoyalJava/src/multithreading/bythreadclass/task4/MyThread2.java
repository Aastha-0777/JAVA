package multithreading.bythreadclass.task4;

public class MyThread2 extends Thread{

	Table resource = null;
	
	public MyThread2(Table resource) {

		this.resource = resource;

	}
	
	@Override
	public void run() {

		resource.printTable(201, 400);

	}
	
}
