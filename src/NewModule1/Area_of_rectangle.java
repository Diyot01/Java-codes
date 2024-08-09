package NewModule1;
import java.util.Scanner;
import java.util.scanner;
public class Area_of_rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int L = sc.nextInt();
		System.out.println("Enter the width : ");
		int W = sc.nextInt();
		int A = L*W;
		System.out.print("The area of the rectangle is "+A);
	}
}
