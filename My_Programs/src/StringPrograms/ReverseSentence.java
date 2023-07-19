package SampleTest;
import java.util.Scanner;
public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = revSentence(str);
		System.out.println(res);
	}
	private static String revSentence(String str) {
		char[] ch = str.toCharArray();// adam basha
		String res = "";
		int i = 0;
		while (i < ch.length) {
			String st = "";
			while (i < ch.length && ch[i] != ' ') {
				st = st + ch[i];
				i++;
			}
			res = st + " " + res;
		//   "" = adam+" "+"";
			//====>adam
		//     = basha +""+adam
		//	======>basha adam 
			
			i++;
		}
		return res;
	}

}
