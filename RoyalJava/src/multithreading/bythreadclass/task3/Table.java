package multithreading.bythreadclass.task3;

public class Table {

	public void printTable(int no) {

		for (int i = 1; i < 11; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(no + " * " + i + " = " + (no * i));
			
		}

	}
	
}
