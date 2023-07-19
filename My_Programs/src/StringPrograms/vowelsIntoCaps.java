package Adam_Programs;

import java.util.Scanner;

public class vowelsIntoCaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
					
					if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
						ch[i]=(char)(ch[i]-32);
					}			
		}
		String res=new String(ch);
		System.out.println(res);
	}

}
