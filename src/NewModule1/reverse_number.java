package NewModule1;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12855;
		int rev = 0;
		while (n>0) {
			int ld = n % 10 ;
			rev = rev * 10 + ld;
			n = n/ 10;
			
			
	
		}
		System.out.print(rev);

	}

}
