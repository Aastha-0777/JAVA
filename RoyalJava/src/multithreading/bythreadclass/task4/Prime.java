package multithreading.bythreadclass.task4;

public class Prime {

	public synchronized boolean isPrime(int no) {
		
		
		
		if (no <= 1) {
			return false;
		}

		for (int i = 2; i * i <= no; i++) {
			// If an exact divisor is found, it is not a prime number
			if (no % i == 0) {
				return false;
			}
		}

		// If no divisors were found, it is prime
		return true;
	}
}
