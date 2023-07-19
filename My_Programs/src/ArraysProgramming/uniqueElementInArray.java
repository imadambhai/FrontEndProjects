package ArraysProgramming;

import java.util.Scanner;

public class uniqueElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] x = new int[a];// {1,2,3,4,5,1,2}
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		boolean[] b = new boolean[a];
		for (int i = 0; i < x.length; i++) {
			if (b[i] == false) {
				for (int j = i + 1; j < x.length; j++) {
					if (x[i] == x[j]) {
						b[i] = true;
						b[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (b[i] == false) {
				System.out.println(x[i]);
			}
		}
	}
}

//
//
//1. WAJPT nth fibonoci num is prime or not
//
//2. merge array with ziczac order
//
//3. count how many palindrome in sentence
//
//4. Multiple of two matrix
//
//5. print unique element in array