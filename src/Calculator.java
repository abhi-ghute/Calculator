import java.util.Scanner;

public class Calculator {

	static double add(double num1, double num2) {
		return num1+num2;
	}
	
	static double subsract(double num1, double num2) {
		return num1-num2;
	}
	
	static double mupltiply(double num1, double num2) {
		return num1*num2;
	}
	
	static double Division(double num1, double num2) {		
		return num1/num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator Application");
		
		outerloop:while(true) {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.println("\nEnter your choice");
			
			int choice = sc.nextInt();
			
			if(choice==5)
				break outerloop;
			
			System.out.println("Enter Number1:");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter Number2:");
			double num2 = sc.nextDouble();
			
			double result=0;
			
			switch (choice) {
				case 1:
					result=add(num1,num2);
					System.out.println("Addition : "+result);
					break;
				case 2:
					result=subsract(num1, num2);
					System.out.println("Substraction : "+result);
					break;
				case 3:
					result=mupltiply(num1, num2);
					System.out.println("Multiplication : "+result);
					break;
				case 4:
					result=Division(num1, num2);
					System.out.println("Division : "+result);
					break;
				default:
					System.out.println("Enter correct choice...");
					break;
			}
			System.out.println("------------------------------------------\n");
			
		}
		System.out.println("Thanks for using Application");
		sc.close();
	}
}
