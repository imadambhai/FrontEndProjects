package ArraysProgramming;

import java.util.Scanner;

public class zicZacArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = readArray(a);
		int[] y = readArray(b);
		
		int[] z=zicZacArray(x,y);
		for(int i=0;i<z.length;i++) {
			System.out.print(z[i]+ " ");
		}

	}
	
	
	private static int[] zicZacArray(int[] x, int[] y) {
		int[] z=new int[x.length+y.length];
		int j=0;
		for(int i=0;i<z.length;i++) {
			if(i<x.length&&i<y.length) {
				z[j]=x[i];
				j++;
				z[j]=y[i];
				j++;
				
			}
			else if(i<x.length) {
				z[j]=x[i];
				j++;
			}
			else if(i<y.length) {
				z[j]=y[i];
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
