package SampleTest;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		boolean b = isAnagram(str1, str2);
		if (b) {
			System.out.println("It is a Anagram");
		} else {
			System.out.println("It is not a anagram");
		}

	}

	private static boolean isAnagram(String str1, String str2) {
		int[] arr1 = findPangram(str1);
		int[] arr2 = findPangram(str2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}

		return true;
	}

	private static int[] findPangram(String str) {

		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				char c = str.charAt(i);
				int a = c - 65;
//				System.out.println(c);
				arr[a]++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				int c = str.charAt(i);
				arr[c - 97]++;
			}
		}

		return arr;
	}

}
