package NewModule1;

public class sum_of_digits {

	public static void main(String[] args) {
		int a = 12855;
		int sum = 0;
		while (a>0) {
			int ld = a % 10 ;
			sum = sum + ld;
			a = a / 10 ;
		}
		System.out.print(sum);
	}
}