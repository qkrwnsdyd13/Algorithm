import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int b = sc.nextInt();
        sc.nextLine();

        String a[] = new String[b];

        for ( int i = 0; i < b; i++ ) {
            a[i] = sc.nextLine();
        }

        for ( int i = 0; i < b; i++ ) {
            System.out.println(a[i].charAt(0) +""+ a[i].charAt(a[i].length() -1));
        }
    } 
}