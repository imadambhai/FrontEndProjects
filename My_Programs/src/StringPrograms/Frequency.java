package SampleTest;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++) {
			int c=str.charAt(i);
			arr[c]++;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println((char)(i)+" => "+arr[i]);
			}
		}
		
		
		
	}

}
