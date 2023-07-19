package SampleTest;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = revSentence(str);
		System.out.println(res);
	}
	private static String revSentence(String str) {
		char[] ch = str.toCharArray();// adam basha  Output=> basha adam
		String res = "";
		int i = 0;
		while (i < ch.length) {
			String st = "";
			while (i<ch.length&&ch[i] != ' ') {
				st =  ch[i]+st;
				i++;
			}
			res = res+st+" ";
			i++;
		}
		return res;
	}

}
