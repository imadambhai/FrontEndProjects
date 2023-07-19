package Adam_Programs;

import java.util.Scanner;

public class nearByVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int a = c;
		char fchar = ' ';
		char bchar = ' ';

		int fcount = 0, bcount = 0;
		for (int i = a;; i++) {
			fcount++;
			fchar = (char) i;
			// System.out.println(fchar);
			if (fchar == 'a' || fchar == 'e' || fchar == 'i' || fchar == 'o' || fchar == 'u' || fchar == 'A'
					|| fchar == 'E' || fchar == 'I' || fchar == 'O' || fchar == 'U') {
//				System.out.println(fchar);
				break;
			}
		}

		for (int i = a; i >= 0; i--) {
			bcount++;
			bchar = (char) i;

			if (bchar == 'a' || bchar == 'e' || bchar == 'i' || bchar == 'o' || bchar == 'u' || bchar == 'A'
					|| bchar == 'E' || bchar == 'I' || bchar == 'O' || bchar == 'U') {
//				System.out.println(bchar);
				break;
			}

		}
		if (fcount <= bcount) {
			System.out.println(fchar);
		} else
			System.out.println(bchar);
	}

}
