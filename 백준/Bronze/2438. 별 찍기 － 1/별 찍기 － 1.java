import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for ( int i = 1; i <= a; i++) {
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}