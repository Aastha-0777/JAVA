package multithreading.bythreadclass.task4;

public class Prime {

	public boolean isPrime(int no) {
		
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return false;
			}
		}

		return true;
		
	}
}
