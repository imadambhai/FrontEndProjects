package SampleTest;

import java.util.Scanner;

public class BiggestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//    rama is a boy
		char[] ch = str.toCharArray();// 0
		String st = "";
		String big = "";
		int b = 0;

		for (int i = 0; i < ch.length; i++) {

			if (i <= ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				st = st + ch[i];
			}
			if (ch[i] == ' ' || i == ch.length - 1) {
				if (st.length() > b) {
					big = st;
					b = st.length();

				}
				st = "";
			}

		}
		System.out.println(big + " is a biggest word");
	}

}
