package ArraysProgramming;

import java.util.Scanner;

public class multyOfMatrix {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int[][] x = readArray(row1,col1);
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int[][] y = readArray(row2,col2);
		
		int[][] res=new int[row1][col2];
		res=matrixmulty(x,y);
		
		
		

		
	}
	private static int[][] matrixmulty(int[][] x, int[][] y) {
		for(int i=0;i<x.length;i++) {
			
		}

		
		
		return null;
	}
	private static int[][] readArray(int row, int col) {
		int[][] z=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				z[i][j]=sc.nextInt();
			}
		}
		

		
		return z;
	}


}
