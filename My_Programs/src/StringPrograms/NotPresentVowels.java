package SampleTest;

import java.util.Scanner;

public class NotPresentVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };
		boolean[] b = new boolean[ch.length];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
				b[0] = true;
			else if (str.charAt(i) == 'e' || str.charAt(i) == 'E')
				b[1] = true;
			else if (str.charAt(i) == 'i' || str.charAt(i) == 'I')
				b[2] = true;
			else if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
				b[3] = true;
			else if (str.charAt(i) == 'u' || str.charAt(i) == 'U')
				b[4] = true;

		}
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == false) {

				System.out.println(ch[i] + " is not present");
			} else {
				count++;
			}
			if (count == 5) {
				System.out.println("All vowels are presented");
			}

		}

	}

}
