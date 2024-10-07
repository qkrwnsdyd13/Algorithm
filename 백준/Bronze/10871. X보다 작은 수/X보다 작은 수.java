import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int b[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
			if (X > b[i]) {
				System.out.print(b[i] + " ");
			}
		}
	}
}