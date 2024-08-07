package NewModule1;
import java.util.Scanner;

public class Grade_calci {

	public static void main(String[] args) {
		System.out.println("Giving grades as per marks obtained");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int a=100, b=101,c=90,d=75,e=60,f=45;
		int M = sc.nextInt();
		if(M>a) {
			System.out.print("The marks are invalid");
		}
		else if(M>=c){
			System.out.print("The grade is O");
		}
		else if (M>=d) {
			System.out.print("The grade is A");
		}
		else if(M>=e) {
			System.out.print("The grade is B");
		}
		else if(M>=f) {
			System.out.print("The grade is C");	
		}
		else {
			System.out.print("The grade is D");
		}
	}

}
