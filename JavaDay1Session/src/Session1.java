// syso+ctrl+spacebar
// WJP to find biggest of three numbers , consider numbers from user input
// ctrl+shft+spacebar --> Break point
// WJP by choosing mode of tansport
/* By Car --> Reach office in 30 min
 * By Bus --> Reach office in 40 min
 * By Train --> 50 min
 * Walk --> I dont go to office 
 * 
 * WJP to Print number from 1 to 100
 */
import java.util.Scanner;

public class Session1 {
	public static void main(String[] args) {
//
//for(<initial Value>, <Condition>, <counter>){
//	
//}

		for(int i = 1; i <=100; i++){
			System.out.print(i+ " ");
			if (i %10 ==0)
				System.out.println();
			
		}
		
	for(int i = 0; i<5; i++){
		System.out.println("Selenium automation");	
	}
		
		
		
		
		Scanner in = new Scanner(System.in);
		String transport;
		transport = in.nextLine();
		switch(transport){
		case "car":
			System.out.println("It will take 30 miles to reach office");
			break;
		case "bus":
			System.out.println("It will take 40 miles to reach office");
			break;
		case "train":
			System.out.println(" reach office");
			break;
		case "walk":
			System.out.println("It will take 30 miles to reach office");
			break;
		default:
			System.out.println("Invalid option");
		}
	}
}


//	public static void main(String[] args) {
//		
//		int empId = 5060;
//		
//		switch (empId) {
//		case 1:
//			System.out.println("Name: Raj, Title: CEO");
//			break;
//			
//		case 2:
//			System.out.println("Name: Jhon, Title: VP ");
//			break;
//			
//		case 5060:
//			System.out.println("Name: Abhi, Title: SE");
//			break;
//
//		default:
//			break;
//		}
//		
//		if(empId == 1){
//			System.out.println("Name: Raj, Title: CEO");
//		}
//		
//		if(empId == 2){
//			System.out.println("Name: Jhon, Title: VP ");
//		}
//		



//		
//		if(empId == 5060){
//			System.out.println("Name: Abhi, Title: SE");
//		}
//		
//		
//		int x, y, z;
//		System.out.println("Enter three integers");
//		Scanner in=new Scanner(System.in);
//		x=in.nextInt();
//		y=in.nextInt();
//		z=in.nextInt();
/*if(x==y){
			if(x>z){
				System.out.println("Greatest number is "+x);
			}
			else{
				System.out.println("Greatest number is "+z);
			}
		}
		else{
			if((x>y)&&(x>z)){
				System.out.println("Greatest number is "+x);
			}
			else{
				if(y>z){
					System.out.println("Greatest number is "+y);
				}
				else{
					System.out.println("Greatest is "+z);
				}
			}
		}*/
//		if(x==y &x==z){
//			System.out.println("All are same numbers");
//		}
//		else{
//			if(x>=y && x>=z){
//				System.out.println(x+" is the largest number");
//			}
//			else if(y>=z){
//				System.out.println(y+" is the greatest number");
//				
//			}
//			else{
//				System.out.println(z+" is the greatest number");
//			}
//		}
//	}
//
//}	







