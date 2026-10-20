package dsa;

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {

				digits[i] += 1;
				return digits;

			} else if (digits[i] == 9) {

				digits[i] = 0;
				
			}

		}

		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
		

	}

	public static void main(String[] args) {

		int[] digitArr = {9, 9, 9};

		int[] res = plusOne(digitArr);

		for (int i = 0; i < res.length; i++) {

			System.out.print(res[i] + " ");

		}

	}

}
