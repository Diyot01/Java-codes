package NewModule1;
import java.util.Scanner;

public class Even_or_odd {

	public static void main(String[] args) {
		System.out.println("Checking the number is odd or even");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		if(N==0){
			System.out.print("The number is neither even nor odd");
		}
		else if (N%2!=0) {
			System.out.print("The number is odd");
		}
		else {
			System.out.print("The number is even");
			
		}
	}

}
