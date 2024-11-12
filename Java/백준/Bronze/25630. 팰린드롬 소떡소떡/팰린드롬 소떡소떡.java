import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String str = sc.next();
		int count = 0;
		
		for ( int i = 0; i < str.length()/2; i++) {
			if ( str.charAt(i) == str.charAt(str.length()-1-i)) {
				count++;
			}
		}
		System.out.println(str.length()/2-count);
	}
}