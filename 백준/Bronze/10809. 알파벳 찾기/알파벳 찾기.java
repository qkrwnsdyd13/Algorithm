import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.next();
    	int a[] = new int[26];
    	int c;
    	
    	for ( int i = 0; i < 26; i++) {
    		a[i] = -1;
    	}
    	
    	for ( int i = 0; i < str.length(); i++) {
    		c = str.charAt(i);
    		if (a[c-97] == -1) {
    			a[c-97] = i;
    		}
    	}
    	
    	for ( int i = 0; i < 26; i++ ) {
    		System.out.print(a[i] + " ");
    	}
    }
}