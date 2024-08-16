package NewModule1;

import java.util.Scanner;

public class fever_testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the temperature in F : ");
		float t = sc.nextFloat();
		if(t>=(98.6)) {
			System.out.print("You have fever");
		}
		else {
			System.out.print("You are normal");
		}

	}

}
