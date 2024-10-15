import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int c[] = new int[26];
		
		for (int i = 0; i < a.length(); i++) {
			int b = a.charAt(i);
			c[b-97]++;
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(c[i] + " ");
		}
	}
}