import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b;
		
		
		for ( int i = 0; i < a; i++ ) {
			 b = sc.next();
			 int count = 0;
			 int combo = 0;
			 for ( int j = 0; j < b.length(); j++ ) {
				 if ( b.charAt(j) == 'O') {
					 count++;
					 combo += count;
				 } else {
					 count = 0;
				 }
			 }
			 System.out.println(combo);
		}
	}
}
