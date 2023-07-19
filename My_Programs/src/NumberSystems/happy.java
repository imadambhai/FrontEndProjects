package NumberSystems;

import java.util.Scanner;

public class happy {
	static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int d=n%10;
				sum =sum+d*d;
				n=n/10;
				
			}
			n=sum;
			
		}
		return n==7||n==1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number:");
		int n=sc.nextInt();
		
		
		boolean res=isHappy(n);
		if(res==true)
		{
			System.out.println(n+" is happy no");
			main(args);
		}
		else {
			System.out.println(n +" is not a happy no");
			main(args);
		}
	}

}
