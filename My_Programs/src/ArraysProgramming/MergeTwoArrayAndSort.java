package ArraysProgramming;

import java.util.Scanner;

public class MergeTwoArrayAndSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = readArray(a);
		int[] y = readArray(b);

		int[] z = mergeArray(x, y);
		sortingArray(z);
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+" ");
		}

	}

	private static void sortingArray(int[] z) {
		for(int i=0;i<z.length;i++) {
			for(int j=i+1;j<z.length;j++) {
				if(z[i]>z[j]) {
					int temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		
		
		
	}

	private static int[] mergeArray(int[] x, int[] y) {
		int[] z = new int[x.length + y.length];
		int j = 0;
		for (int i = 0; i < z.length; i++) {
			if (i < x.length)
				z[i] = x[i];

			else {
				z[i] = y[j];
				j++;
			}
		}

		return z;
	}

	private static int[] readArray(int a) {

		System.out.println("Enter " + a + " elements");
		int[] x = new int[a];
		for (int i = 0; i < a; i++) {
			x[i] = sc.nextInt();

		}

		return x;
	}

}
