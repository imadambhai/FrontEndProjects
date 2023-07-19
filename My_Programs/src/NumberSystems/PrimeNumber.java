package NumberSystems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean res = isPrime(n);
		if(res) {
			System.out.println(res);
		}else {
			int f=nearestPrimeFront(n);
			int b=nearestPrimeBack(n);
			System.out.println(n+" is not a prime number so...");
			System.out.println("Nearest prime in frontward is :"+f);
			System.out.println("Nearest prime in backward is :"+b);
		}
	}
	private static int nearestPrimeBack(int n) {
		for(int i=n-1;i>=0;i--) {
			boolean res=isPrime(i);
			if(res) {
				return i;
			}
			
		}return 1;
	
	}
	private static int nearestPrimeFront(int n) {
		for(int i=n+1;;i++) {
			boolean res=isPrime(i);
			if(res) {
				return i;
			}
			
		}
		
		
	}
	private static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2)
			return true;
		return false;
	}
}
