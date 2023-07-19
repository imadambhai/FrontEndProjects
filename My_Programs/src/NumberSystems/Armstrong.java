package NumberSystems;

import java.util.Scanner;

public class Armstrong
{
	static int countDigit(int x)
	{
		int count=0;
		do {
			count++;
			x=x/10;
		}
		while(x!=0);
		return count;
		
	}
	static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
	static boolean Armstrong(int y)
	{
		int sum=0,temp=y;
		int cd=countDigit(y);
		do
		{
			int d=y%10;
			sum=sum+pow(d,cd);
			y=y/10;
		}
		while(y!=0);
		return sum==temp;	
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  number:");
	int n=sc.nextInt();
	
	for(int i=0;i<=n;i++)
	{
	boolean res=Armstrong(i);
	if(res==true)
		System.out.println(i+"	  is Armstrong");
	}
}
}