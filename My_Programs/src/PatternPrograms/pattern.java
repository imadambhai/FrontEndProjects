package PatternPrograms;

import java.util.Scanner;

public class pattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i= 1;  i<=n; i++) {
		for (int j = 1; j<=i; j++) {
			if(j%2==1)
				System.out.print(j%2+" ");
			else
				System.out.print((char)(65)+ " ");
//			else
//				5
//			System.out.print(j%2+ " ");
		}
		System.out.println();
	}
	
}
}
