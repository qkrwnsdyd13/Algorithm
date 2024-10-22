import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[4];
		int b[] = new int[4];
		
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			
			sum += b[i] - a[i];
			
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}