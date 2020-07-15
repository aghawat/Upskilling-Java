import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ForLoopArray {

	public static void main(String[] args) {
		long start = System.nanoTime();
		// System.out.println("starting on "+ start);
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(50);
		System.out.println("number of students");
		int stdnum = scan.nextInt();

		for(int s =1;s<=stdnum;s++) {
			
			
			System.out.println("enter marks for std "+ s);
			int n = scan.nextInt();
			int std[] = new int[n];
				for (int i = 0; i < std.length; i++) {
					std[i] = rand.nextInt(50);}
				//===========================================
				int sum = 0;
				for (int i = 0; i < std.length; i++) {

					sum += std[i];

				}
				//===========================================

				Arrays.sort(std);
//	    for (int i: std1) {
//            System.out.println(i);
//        }
				//===========================================
				System.out.println("sum is " + sum);
				System.out.println("avg is " + sum / std.length);
				long ending = System.nanoTime();
				//System.out.println(ending);
				long duration = ending - start;
				System.out.println("duration = " + duration / 10000000);
				System.out.println("============================");
			}
		
		System.out.println("Class Endind...");
		}

	}


