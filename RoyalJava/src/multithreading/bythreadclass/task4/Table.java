package multithreading.bythreadclass.task4;

public class Table {

	public void printTable(int start, int end) {

		int fc = 0;

		for (int i = start; i <= end; i++) {

			int no = i;

			for (int j = 0; j <= no; j++) {

				if (no % i == 0) {

					fc++;

				}

			}
			
			if (fc == 2) {

				for (int k = 1; k < 11; k++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					System.out.println(no + " * " + k + " = " + (no * k));

				}

				
			} // end of if

		}

		

	}

}
