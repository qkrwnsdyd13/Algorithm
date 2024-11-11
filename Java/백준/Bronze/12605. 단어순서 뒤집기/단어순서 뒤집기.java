import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String b = sc.nextLine();
		
		for ( int i = 1; i <= N; i++ ) {
			b = sc.nextLine();
			
			String arr[] = b.split(" ");
			System.out.print("Case #"+i+": ");
			for ( int j = arr.length-1; j >= 0 ; j-- ) {
				System.out.print(arr[j] + " ");
			}
		}
		
		for ( int i = 1; i <= N; i++ ) {
			
		}
	}
}