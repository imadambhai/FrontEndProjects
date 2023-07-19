package Adam_Programs;

import java.util.Scanner;

public class PrintNotPresentVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		int a=0,e=0,i=0,o=0,u=0;
		for(int j=0;j<st.length();j++) {
			char c=st.charAt(j);
			if(c=='a'||c=='A')
				a++;
			else if(c=='e'||c=='E')
				e++;
			else if(c=='i'||c=='I')
				i++;
			else if(c=='o'||c=='O')
				o++;
			else if(c=='u'||c=='U')
				u++;
			if(a>=1&&e>=1&&i>=1&&o>=1&&u>=1)
				System.out.println("All vowels are presented");
			
			
			
			
		}
		
		
	}

}
