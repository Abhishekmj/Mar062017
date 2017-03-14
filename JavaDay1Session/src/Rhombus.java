import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {

		String WonderChar;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter your input charter");
		WonderChar = in.nextLine();
		
		for (int i=1;i<=4; i++){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(WonderChar+ " ");
			}
			System.out.println();
		}
		
		for (int i=3;i>=1; i--){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(WonderChar+ " ");
			}
			System.out.println();
		}

	}

}
