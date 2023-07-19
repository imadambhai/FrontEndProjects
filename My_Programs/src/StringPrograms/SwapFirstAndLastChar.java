package SampleTest;

import java.util.Scanner;

public class SwapFirstAndLastChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = interChangeChar(str);
		System.out.println(res);
	}

	private static String interChangeChar(String str) {
		int f = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				f = i;
			}
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char t = ch[i];
				ch[i] = ch[f];
				ch[f] = t;
			}
		}
		String res = new String(ch);
		return res;
	}

}
