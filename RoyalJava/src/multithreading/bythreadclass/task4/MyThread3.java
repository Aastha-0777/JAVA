package multithreading.bythreadclass.task4;

public class MyThread3 extends Thread{

	Table resource = null;
	
	public MyThread3(Table resource) {

		this.resource = resource;

	}
	
	@Override
	public void run() {

		resource.printTable(401, 600);

	}
	
}
