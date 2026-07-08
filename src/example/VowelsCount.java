package example;
import java.util.Scanner;
public class VowelsCount {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string : ");
		str=sc.next();
		int count=0;
		for(int i=0; i<str.length()-1; i++) {
			char c=str.charAt(i);
			if( c == 'a' || c =='A'||c=='e' ||c== 'E' ||c== 'i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
				count++;
			}
		}
		System.out.println(count);
				
	}
}
