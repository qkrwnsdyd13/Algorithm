import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.nextLine();
		
		for ( int i = 0; i < a; i++ ) {
			b = sc.nextLine();
			String[] arr = b.split(" ");
			for ( int j = 0; j < arr.length; j++ ) {
				StringBuilder sb = new StringBuilder(arr[j]);
				System.out.print(sb.reverse() + " ");
			}
			
			System.out.println();
		}
	}
}