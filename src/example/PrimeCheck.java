package example;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String arg[]) {
	int n;
	boolean isPrime=true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	n=sc.nextInt();
	for(int i=2; i<=n-1; i++) {
		if(n % i == 0) {
			isPrime=false;
		}
		
	}
	if(isPrime) {
		System.out.println("prime number!");
	}
	else{
		System.out.println("Not a prime number!");
	}
	}
}
