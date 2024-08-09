package NewModule1;
import java.util.Scanner;

public class Total_Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hourly wage : ");
		int x = sc.nextInt();
		System.out.println("Enter hours worked : ");
		int y = sc.nextInt();
		int z = x*y;
		System.out.print("The total salary is "+z);
	}

}
