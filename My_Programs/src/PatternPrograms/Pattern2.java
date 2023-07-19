package PatternPrograms;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 5;
		
//		int t=5;

		for (int i = 5; i >= 1; i--) {
			int t=i;
			
			for(int j=1;j<=n;j++) {
				System.out.print((char)(t+64)+" ");
				t=t+5;
			}
			
			
			System.out.println();
		}
		
		
	}

}
