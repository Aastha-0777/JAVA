package dsa;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {

//		String[] splited = s.split(" ");
//		
//		return splited[splited.length - 1].length();

		int i = s.length() - 1;
		int length = 0;

		while (s.charAt(i) == ' ' && i >= 0) {

			i--;

		}

		while (s.charAt(i) != ' ' && i >= 0) {

			length++;
			i--;

		}

		return length;
		
	}

	public static void main(String[] args) {

		String str = "   fly me   to   the moon  ";

		int len = lengthOfLastWord(str);

		System.out.println("The Lenght of last word is : " + len);

	}

}
