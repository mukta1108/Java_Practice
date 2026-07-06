package example;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0,n,i;
		System.out.println("Enter no : ");
		n=sc.nextInt();
		System.out.println("fibonacci seies till "+n+" :");
		for(i=0; i<=n; i++) {
			if(c > n) {
				break;
			}
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}
