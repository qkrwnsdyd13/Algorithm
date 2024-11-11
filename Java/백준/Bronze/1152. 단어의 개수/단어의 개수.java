import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		String btrim = b.trim();
		
		if (btrim.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(btrim.split(" ").length);	
		}

	}
}