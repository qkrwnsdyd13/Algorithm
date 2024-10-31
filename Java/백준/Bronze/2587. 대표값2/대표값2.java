import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		int num = 0;
		
		for ( int i = 0; i < 5; i++ ) {
			a[i] = sc.nextInt();
			num += a[i];
		}
		
		System.out.println(num/5);
		Arrays.sort(a);
		System.out.println(a[2]);
	}
}