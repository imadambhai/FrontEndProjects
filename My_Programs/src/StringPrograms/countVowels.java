package Adam_Programs;

import java.util.Scanner;

public class countVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		int vowels=0,con=0;
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			if(c>='A'&&c<='Z'||c>='a'&&c<='z') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
					vowels++;
				else
					con++;
			}
			
		}
		System.out.println(vowels);
		System.out.println(con);
		
	}

}
