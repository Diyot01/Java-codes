package NewModule1;

import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter year");
		int y = sc.nextInt();
		if(y%4==0) {
			if(y%100==0) {
				if(y%400==0) {
					System.out.print("Leap year");
				}
				else {
					System.out.print("Not a leap year");
				}
			}
			else {
				System.out.print("Leap year");
			}
		}
		else {
			System.out.print("Not a leap year");
		}
		
	}

}
