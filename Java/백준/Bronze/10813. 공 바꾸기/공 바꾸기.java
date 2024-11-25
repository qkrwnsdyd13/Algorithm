import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();	
		int a[] = new int[N];
		
		for ( int i = 0; i < N; i++ ) {
			a[i] = i+1;
		}
		
		for ( int i = 0; i < M; i++ ) {
			int sum = 0;
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			sum = a[b-1];
			
			a[b-1] = a[c-1];
			a[c-1] = sum;
		}
		for ( int i = 0; i < N; i++ ) {
			System.out.print(a[i] + " ");
		}
	}
}