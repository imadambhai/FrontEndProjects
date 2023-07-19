package NumberSystems;

import java.util.Scanner;

public class BinaryToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int res=findDec(n);
		System.out.println(res);
		
		
		
	}

	private static int findDec(int n) {
		int dec=0,pw=1;
		while(n!=0) {
			int d=n%10;
			if(d==1)
				dec=dec+pw;
			pw=pw*2;
			n=n/10;
		}
		
		return dec;
	}

}
