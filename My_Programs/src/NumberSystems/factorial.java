package NumberSystems;

import java.util.Scanner;

public class factorial {
	static long findFact(int n)
	{
		long sum=1;
		do{
			
		
		sum=sum*n;
		
		n--;
		}while(n!=0);
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		long res=findFact(n);
		System.out.println("The factorial of given number is "+res);
		main(args);

	}

}
