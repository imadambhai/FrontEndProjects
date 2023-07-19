package NumberSystems;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		 long res = findBinary(n); // This method is run for some specific maximumn number
		//String res = FindingBinary(n); // This method is execute for infinity(own method)
		 //String res=Binary(n); // This method is execute for infinity (Ragi sir
		// method)

		System.out.println(res);

	}

	private static String FindingBinary(long n) {
		long num = 536870912;
		String st = "";
		while (num != 0 || n != 0) // n=90
		{
			if (num <= n) {// 1<=0
				st = st + 1;
				n = n - num;
				num = num / 2;

			} else {
				st = st + 0;
				num = num / 2;

			}
		}

		return st;
	}

	private static String Binary(int n) {
		String st = "";
		while (n > 0) {
			int r = n % 2;
			st = r + st;
			n = n / 2;
		}

		return st;
	}

	private static long findBinary(long n) {
		long num = 536870912;
		long res = 0;
		while (num != 0 || n != 0) // n=90
		{
			if (num <= n) {// 1<=0
				res = res * 10 + 1;
				n = n - num;
				num = num / 2;

			} else {
				res = res * 10 + 0;
				num = num / 2;

			}
		}

		return res;
	}

}
