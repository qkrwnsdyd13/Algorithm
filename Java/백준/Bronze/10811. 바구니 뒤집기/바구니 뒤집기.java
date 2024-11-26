import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();	
		int a[] = new int[N+1];
		
		for ( int i = 1; i <= N; i++ ) {
			a[i] = i;
		}
		
		for ( int i = 0; i < M; i++ ) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for ( int j = 0; j <= (c-b)/2; j++ ) {
				int sum = a[b+j];
				
				a[b+j] = a[c-j];
				a[c-j] = sum;
			}
		}
		for ( int i = 1; i <= N; i++ ) {
			System.out.print(a[i] + " ");
		}
	}
}
