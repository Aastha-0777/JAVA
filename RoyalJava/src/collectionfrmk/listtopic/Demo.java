package collectionfrmk.listtopic;

class ArrayPrinter {

	public static <E> void printArray(E[] array) {

		for (E t : array) {

			System.out.println(t + " ");

		}

	}

}

public class Demo {

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3 };
		String[] names = { "Alice", "Bob" };
		int[] primitives = { 10, 20 }; // Line 
		ArrayPrinter.printArray(nums);
		ArrayPrinter.printArray(names);
//		ArrayPrinter.printArray(primitives); // Line 2 }
	}

}
