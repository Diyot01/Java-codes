package NewModule1;
import java.util.*;
public class days_in_month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number");
		int m = sc.nextInt();
		if(m<=7) {
			if (m==2) {
				System.out.print("It has 28 days");
			}
			else if(m%2!=0) {
				System.out.print("It has 31 days");
			}
			else {
				System.out.print("It has 30 days");
			}
		}
		else if(m>=12) {
			System.out.print("It is an invalid month");
		}
		else {
			if(m%2!=0) {
				System.out.print("It has 30 days");
			}
			else {
				System.out.print("It has 31 days");
			}
		}
	}

}