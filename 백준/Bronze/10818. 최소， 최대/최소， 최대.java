import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a[] = new int[N];

        int max = -1000000;
        int min = 1000000;
        
        for ( int i = 0; i < N; i++ ) {
            a[i] = sc.nextInt();
            if ( a[i] >= max) {
                max = a[i];
            }
            if ( a[i] <= min) {
                min = a[i];
            }
        }
        System.out.println(min + " " + max);
    }
}