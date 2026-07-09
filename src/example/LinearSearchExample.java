package example;
import java.util.Scanner;
public class LinearSearchExample {
	public static int linearSearch(int arr[],int n) {
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6};
		int n;
		System.out.println("Enter no to search in dataset : ");
		n=sc.nextInt();
		int res=linearSearch(arr,n);
		if(res == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at : "+res);
		}
	}
}
