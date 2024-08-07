package NewModule1;
import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		System.out.println("Calculating Simple Interest");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		int P = sc.nextInt();
		System.out.println("Enter the rate of interest");
		int R = sc.nextInt();
		System.out.println("Enter the time in years");
		int T = sc.nextInt();
		double SI = (P*R*T)/100;
		System.out.println("The simple interest for the following inputs is = "+SI);
		double TA = P+SI;
		System.out.print("The final amount after interest is = "+ TA);
		
	}

}
