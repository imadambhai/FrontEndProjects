package SampleTest;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();// i am vicky
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			s1 = str.charAt(i) + s1;// a
			
		}
		System.out.println(s1);
		if(str.equals(s1)) {
			System.out.println("palindrome");
		}
	}
}
