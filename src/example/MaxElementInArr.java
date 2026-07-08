package example;
import java.util.Scanner;
public class MaxElementInArr {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	int max=0;
	int[] arr=new int[5];
	System.out.println("Enter 5 elements : ");
	for(int i=0; i<5; i++) {
		arr[i]=sc.nextInt();
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	System.out.println("Maximum element : "+max);
	}
}
