package NewModule1;
import java.util.Scanner;

public class Temp_convertor {

	public static void main(String[] args) {
		System.out.println("Coverting the temperture to different units");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature");
		double T = sc.nextDouble();
		System.out.println("Enter\n 1 for Celcius to Farenhiet\n 2 for Celcius to Kelvin\n 3 for Kelvin to Celcius\n 4 for Kelvin to Farenhiet\n 5 for Farenhiet to Kelvin\n 6 for Farenhiet to Celcius\n");
		int N = sc.nextInt();
		if(N==1) {
			double C = ((T*9)/5)+32;
			System.out.print(C+" deg. F");
		}
		else if(N==2) {
			double C = T + 273;
			System.out.print(C+" deg. K");
		}
		else if(N==3) {
			double C = T - 273;
			System.out.print(C+" deg. C");
		}
		else if(N==4) {
			double C = (((T - 273)*9)/5)+32;
			System.out.print(C+" deg. F");
		}
		else if(N==5) {
			double C = (((T - 32)*5)/9)+273;
			System.out.print(C+" deg. K");
		}
		else if(N==6) {
			double C =((T - 32)*5)/9;
			System.out.print(C+" deg. C");
		}
	}

}
