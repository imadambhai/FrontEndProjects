package PatternPrograms;

import java.util.Scanner;

public class Pattern1 {

//	5 
//	4 5 
//	3 4 5 
//	2 3 4 5 
//	1 2 3 4 5 
//	5 
//	4 5 
//	3 4 5 
//	2 3 4 5 
//	1 2 3 4 5 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
