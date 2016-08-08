import java.util.Scanner;


public class Test4 {

	public static void main(String[] args) {
	

		int a[] = new int[4];
		int c1 = 0;
                 int c2 = 0;
		Scanner scanner = new Scanner(System.in);
		for (int l = 0; l < 4; l++) {
			a[l] = scanner.nextInt();
		}
		for (int m = 0; m< 5; m++) {
			if (a[m] >= 0) {

				c1++;

			} else if (a[m] <= -1) {
				
				c2++;
			}
		}
				System.out.println(" positive numbers are : " + c1);
			

				System.out.println("negative numbers are : " + c2);
			}

		

	}

	
	 
	
	    