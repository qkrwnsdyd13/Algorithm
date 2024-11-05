import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a;
		
		while ( true ) {
			a = sc.next();
			int count = 0;
			
			if ( a.equals("0")) {
				break;
			}
			
			for ( int i = 1; i <= a.length(); i++) {
				if ( a.charAt(i-1) == a.charAt(a.length()-i)) {
					count++;
				}
			}
			if ( count == a.length()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
						
			
		}
	}
}