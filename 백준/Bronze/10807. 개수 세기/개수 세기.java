import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a[] = new int[N];
        int sum = 0;
        
        for ( int i = 0; i < N; i++ ) {
            a[i] = sc.nextInt();
        }
        
        int v = sc.nextInt();

        for ( int i = 0; i < N; i++ ) {
            if (v == a[i]) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}