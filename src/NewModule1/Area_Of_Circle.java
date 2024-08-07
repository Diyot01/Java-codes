package NewModule1;
import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
		System.out.println("Calculating the area of the circle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the raduis of the circle");
		int x = sc.nextInt();
		double pie = 3.14;
		double area = pie *(x * x);
		System.out.println("The area of the circle is = " + area + " unit sq.");

	}

}
