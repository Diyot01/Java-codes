package NewModule1;
import java.util.Scanner;

public class Plus_minus_zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n==0) {
			System.out.print("The number is zero");
		}
		else if(n>=1) {
			System.out.print("The number is positive");
		}
		else {
			System.out.print("The number is negative");
		}
	}

}
