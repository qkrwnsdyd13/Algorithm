import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt(); //테스트 케이스의 갯수 입력
		
		for (int i = 0; i < T; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println(a+b);
		}
	}
}