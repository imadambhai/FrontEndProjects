package NumberSystems;

import java.util.Scanner;

public class NthFibPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1 = 0, n2 = 1;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if(i==n) {
					boolean b=isPrime(n1);
					if(b)
						System.out.println("This is prime");
					else
						System.out.println("This is not a prime");
					
				}
				int temp=n1+n2;
				n1=n2;
				n2=temp;
			}
		}else {
			System.out.println(n1);
		}

	}

	private static boolean isPrime(int n1) {
		int c=0;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0) {
				c++;
			}
		}
		
		
		return c==2;
	}

}
