import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max, min;

        int first = sc.nextInt();
        max = first;
        min = first;

        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min + " " + max);
    }
}