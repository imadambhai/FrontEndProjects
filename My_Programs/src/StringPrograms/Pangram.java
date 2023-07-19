package SampleTest;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean b=isPangram(str);
		if(b) {
			System.out.println("It is a pangram");
		}
		else {
			System.out.println("It is not a pangram");
		}
	}
	private static boolean isPangram(String str) {
		if(str.length()<26) {
			return false;
		}
		int[] arr=new int[26];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				char c=str.charAt(i);
				int a=c-65;
				arr[a]++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				int c=str.charAt(i);
				arr[c-97]++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println(i);
				return false;
			}
		}
		return true;
	}

}
