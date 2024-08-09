package NewModule1;
import java.util.Scanner;
public class human_to_dog_years {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int A = sc.nextInt();
		int D = 7*A;
		System.out.print("Your age in dog years is "+D);
	}

}
