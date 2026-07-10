package example;
import java.util.Scanner;
public class FrequencyCount {
	public static void main(String arg[]) {
		int n,i,count=0;
		int[] arr= {1,2,3,2,4,2,2,5,4,6,7,6,3};
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter any no from dataset : ");
		n=sc.nextInt();
		for(i=0;i<arr.length; i++) {
			if(arr[i] == n) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Element not in dataset");
		}
		else {
			System.out.println("Element occured in dataset "+count+" times");
		}
	}
}
