import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ab = (a*b);
        int temp = 0;

        while (true) {
            
            temp = a;
            int temp2 = temp%b;

            if ( temp%b == 0) {
                break;
            }

            a = b;
            b = temp2;
        }

        System.out.println(b);
        System.out.print(ab/b);
    }
}