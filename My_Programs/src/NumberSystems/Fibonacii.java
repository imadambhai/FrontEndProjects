package NumberSystems;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fn = 0, sn = 1;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				System.out.print(fn + " ");
				int next = fn + sn;
				fn = sn;
				sn = next;
			}
		} else {
			System.out.println(fn);
		}

	}

}
