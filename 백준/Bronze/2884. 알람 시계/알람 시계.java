import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if ( 15+b > 60 || b == 45) {
			System.out.print(a + " ");
			System.out.print(b-45);
		} else if ( 15+b == 60) {
			if ( a-1 < 0) {
				System.out.print(23 + " ");
			} else {
				System.out.print(a-1 + " ");
			}
			System.out.print(0);
		} else {
			if ( a-1 < 0) {
				System.out.print(23 + " ");
			} else {
				System.out.print(a-1 + " ");
			}
			System.out.print(15+b);
		}
	}
}