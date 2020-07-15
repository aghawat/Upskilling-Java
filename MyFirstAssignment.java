
public class MyFirstAssignment {

	public static void main(String[] args) {

		/* 1 */System.out.println("\n 1");
		for (int n = 1; n <= 5; n++) {
			System.out.print("* ");
		}
		/* 2 */System.out.println("\n 2");

		for (int n = 1; n <= 5; n++) {
			System.out.println("* ");
		}
		/* 3 */System.out.println("\n 3");

		for (int n = 1; n <= 5; n++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

		/* 4 */ System.out.println("\n 4 ");
	
		for (int n=1;n<=5;n++) {
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println("\n");
			
			
		}
		
		/* 5 */ System.out.println("\n 5");
		
		for (int n=5;n>=1;n--) {
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println("\n");
			
			
		}	

		/* 6 */ System.out.println("\n 6");
		
		for (int n=5;n>=1;n--) {
			for (int i = 1; i <=n; i++) {
				System.out.print(" ");
			}
			System.out.println("*\n");
			
			
		}	
		
		
	/* 7 */ System.out.println("\n 7");
		
		for (int n=1;n<=5;n++) {
			for (int i = 1; i <=n; i++) {
				System.out.print(" ");
			}
			System.out.println("*\n");
			
			
		}

	}

}
