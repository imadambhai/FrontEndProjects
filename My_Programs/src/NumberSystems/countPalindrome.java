package NumberSystems;

import java.util.Scanner;

public class countPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();// adam madam malayalam
		int c=0;
		char[] ch=str.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++) {
			
			if(i<ch.length&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ' ) {
					s=s+ch[i];//madam
					//System.out.println(s);
			}
			
			
			if(ch[i]==' '||i==ch.length-1) {
				boolean b=isPalindrome(s);
				if(b) {
					c++;
					System.out.println(s+" ===>It is palindrome "+s);
				}
				
				s="";
			}
			
		}
		System.out.println(c+" palindrome in given string");
		
	}

	private static boolean isPalindrome(String s) {
		String rev="",temp=s;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		return rev.equals(temp);
	}

}
