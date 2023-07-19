package ArraysProgramming;

import java.util.Scanner;

public class ReverseAraay {

	public static void main(String[] args) {
		Arrays a=new Arrays();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] x=a.readArray(size);
		
		int i=0,j=x.length-1;
		while(i<j) {
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}
		
		for(int k=0;k<x.length;k++) {
			System.out.print(x[k]+" ");
		}
	
		
		
		
	}

}
