import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[9];
        int sum = 0;  

        for ( int i = 0; i < 9; i++ ) {
            a[i] = sc.nextInt();
            if (a[i] > sum ) {
                sum = a[i];
            }
        }
        System.out.println(sum);
        for ( int i = 0; i < 9; i++) {
            if (sum == a[i]) {
                System.out.println(i + 1);
            }
        }
    }
}