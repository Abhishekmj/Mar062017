
public class Arrays {

	public static void main(String[] args) {

		int intArry[] = new int[5];

		intArry[0] = 9;
		intArry[1] = 8;
		intArry[2] = 7;
		intArry[3] = 6;
		intArry[4] = 5;


		int temp;

		for(int j = 0; j <intArry.length-1; j++){
			for(int i = 0; i<(intArry.length-1); i++){
				if(intArry[i]>intArry[i+1]){
					temp = intArry[i];
					intArry[i] = intArry[i+1];
					intArry[i+1] = temp;

				}

			}
		}
		
		
		
		int arraylen = intArry.length;

		System.out.println("Lenght of array = " + arraylen);

		for(int i = 0; i<arraylen; i++){
			System.out.println("intArry["+i+"] = "+intArry[i]);
		}

		// WJP to perform Ascending order sort using bubble sort

	}

}
