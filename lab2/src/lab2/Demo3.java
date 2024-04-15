package lab2;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		int arr[][] = new int [3][0];
		Scanner scan=new Scanner(System.in);
		for (int i=0;i < arr.length;i++) {
			for (int j=0; j <arr[i].length;j++) {
				System.out.println();
				arr[i][j] =scan.nextInt();
			}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0; j <arr[i].length;j++) {
				System.out.println(arr[i][j]+"");
			}
			System.out.println();
		}
	}
}
