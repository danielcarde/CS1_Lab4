//Daniel Cardenas
import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab4{

	public static void main(String[] args){

		//Note: Starter code structure does not need to be followed exactly if you have a different way
		//to solve go ahead and solve BUT switch statements and loops must be used when specified

		//Create Scanner for user input
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		int firstNum = 0;
		int secNum = 0;
		int factNum = 0;
		
		while(cont){
			try{
				//Print menu
				System.out.println("Choose an option:");
				System.out.println("1. Add");
				System.out.println("2. Subtract");
				System.out.println("3. Multiply");
				System.out.println("4. Divide");
				System.out.println("5. Modulus");
				System.out.println("6. Factorial");
				System.out.println("7. Exit");

				//Grab user input if user enters exit option end program, otherwise continue 
				int option = input.nextInt();
				if (option > 0 && option <= 5){
					System.out.println("Enter the first number");
					firstNum = input.nextInt();
					System.out.println("Enter the second number");
					secNum = input.nextInt();
				}
				else if(option == 6){
					System.out.println("Enter the number you want to find the factorial of");
					factNum = input.nextInt();
				}
				else if(option == 7){
					cont=false;
					System.out.println("Thank You!");
					break;
				}
				
				switch (option){
					
					case 1:
						System.out.println("The sum is: " + (firstNum + secNum));
						break;
					case 2:
						System.out.println("The difference is: " + (firstNum - secNum));
						break;
					case 3:
						System.out.println("The product is: " + (firstNum * secNum));
						break;
					case 4:
						if(secNum == 0){
							System.out.println("You cannot divide by zero!");
						}
						else{
						System.out.println("The quotient is: " + (firstNum / secNum));
						}
						break;
					case 5:
						System.out.println("The remainder is: " + (firstNum % secNum));
						break;
					case 6:
						int factProduct = 1;
						for(int i=1;i<=factNum;i++){
							factProduct = i *factProduct;
						}
						System.out.println("The factorial is: " + (factProduct));
						break;
					default:
						System.out.println("Invalid Input!");
					}

				//Use switch statement to choose an option and complete appropriate arithmetic operation

				// Switch statement syntax:
				// switch(/***/) {
				//   case x:
				//     // code block
				//     break;
				//   case y:
				//     // code block
				//     break;
				//   default:
				//     // code block
				// }
			}
				catch (InputMismatchException e){
					System.out.println("Invalid Input! Please Try Again!");
					input.next();
				}
		}
	


		


	}
}
