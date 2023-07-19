package ArraysProgramming;

public class Arrays implements Array {

	public static void main(String[] args) {
		

	}

	@Override
	public int[] readArray(int a) {
		System.out.println("Enter " + a + " elements");
		int[] x = new int[a];
		for (int i = 0; i < a; i++) {
			x[i] = sc.nextInt();

		}

		return x;

	}

	@Override
	public int[] sortArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return null;
	}

	@Override
	public void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	@Override
	public int[] reverseArray(int[] a) {

		int i=0,j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return a;
	}

	@Override
	public int[] ReadArray() {
		System.out.println("Enter the size");
		int a=sc.nextInt();
		System.out.println("Enter " + a + " elements");
		int[] x = new int[a];
		for (int i = 0; i < a; i++) {
			x[i] = sc.nextInt();

		}

		return x;
	}

}
