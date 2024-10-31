import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		for ( int i = 0; i < st.length(); i++ ) {
			int a = st.charAt(i);
			
			if ( a >= 97) {	
				char ch = (char)(a-32);
				System.out.print(ch);
			} else {			
				char ch = (char)(a+32);
				System.out.print(ch);
			}
		}
	}
}