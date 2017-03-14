import java.util.Scanner;

/*     1
 *   1   1
 *  1  2  1
 *  
 *  
 *  
 * */



/* Step 1   --> 
 * 
 * int number = 1;
 * Syso (number);
 * 
 * 
 * 
 * 
 * */

public class TestPascleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,i,k, number=1,j;
		Scanner scan= new Scanner(System.in);
		r = scan.nextInt();
		
		for(i=0; i<r; i++){
			for(k=r; k>i; k--){
				System.out.print(" ");
			}
			
			number = 1;
			for (j=0; j<=i;j++){
				System.out.print(number+" ");
				number= number*(i-j)/(j+1);
				
			}
			System.out.println();
		}
	}

}
