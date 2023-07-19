package NumberSystems;

import java.util.Scanner;

public class isPerfect {
	
	static boolean sPerfect(int n)
	{
		int x=2,t=n;
		int sum=0;
		do {
			if(x<=n)
			{
			int r=n/x;
			if(n%x==0)
			{
				sum=sum+r;	
			}
			x++;
			}	
			}while(x<=n);
		return sum==t;	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		boolean res=sPerfect(n);
		if(res==true)
			{
			System.out.println("The given number is perfect number");
		
			}
		
		else
			System.out.println("The given number is NOT perfect number");

			
		
	}

}
