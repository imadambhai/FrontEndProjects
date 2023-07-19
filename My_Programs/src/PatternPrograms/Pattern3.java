package PatternPrograms;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i==j||i+j==n+1) {
					System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		
	}

}
//i==1||i==n||i==j&&i>=n/2+1||j+i==n+1&&i<=n/2+1