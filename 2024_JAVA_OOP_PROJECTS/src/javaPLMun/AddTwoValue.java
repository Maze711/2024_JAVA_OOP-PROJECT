package javaPLMun;

import java.util.Scanner;

public class AddTwoValue {

	static void InputChecker() {
		System.out.println("THE NUMBER SHOULD BE POSITIVE!");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum, sum, diff, div, multi, mod;

		do {
			System.out.println("Enter First number: ");
			firstNum = sc.nextInt();
			if (firstNum < 0) {
				InputChecker();
			}
		} while (firstNum < 0);
		
		do {
			System.out.println("Enter Second number: ");
			secondNum = sc.nextInt();
			if (secondNum < 0) {
				InputChecker();
			}
		} while (secondNum < 0);

		sum = firstNum + secondNum;
		diff = firstNum - secondNum;
		div = firstNum / secondNum;
		multi = firstNum * secondNum;
		mod = firstNum % secondNum;
		
		System.out.println("The Sum of "+ firstNum +" and "+ secondNum +" is: "+ sum);
		System.out.println("The Difference of "+ firstNum +" and "+ secondNum +" is: "+ diff);
		System.out.println("The Division of "+ firstNum +" and "+ secondNum +" is: "+ div);
		System.out.println("The Multiplication of "+ firstNum +" and "+ secondNum +" is: "+ multi);
		System.out.println("The Modulus of "+ firstNum +" and "+ secondNum +" is: "+ mod);
		
		sc.close();
	}
}
