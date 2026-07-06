package example;
import java.util.Scanner;
public class PalindromeString {
	public static void main(String arg[]) {
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		str=sc.next();
		char[] c = str.toCharArray();
		
		int left=0;
		int right=c.length-1;
		while(left < right) {
			char t=c[left];
			c[left]=c[right];
			c[right]=t;
			
			left++;
			right--;
		}
		String rev=new String(c);
		if(rev.equals(str)) {
			System.out.println("Palindrome string");
		}
		else {
		System.out.println(" Not a Palindrome string");
		}
	}
}
