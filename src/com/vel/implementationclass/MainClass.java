package com.vel.implementationclass;

import java.util.Scanner;

public class MainClass extends CalculatorClass {
	int a, b, num;
	Scanner scan = new Scanner(System.in);

	public void calulate() {
		CalculatorClass obj = new CalculatorClass();
		System.out.println();
		System.out.println("1. Addition of two number\t" + "2. Subtraction of two number\t" + "3. Multiplication of two number");
		System.out.println("4. Division of two number\t" + "5. Modulus of two number\t" + "6. Square of number\t"+ "7. Cube of number\t");
		System.out.println("8. Average of numbers\t\t" + "9. Factors of numbers\t\t" + "10.Find out even or odd number");
		System.out.println();
		
		System.out.println("Please Select Any Number of Operation that you want to perform");
		num = scan.nextInt();
			
		switch (num) {
			case 1:
			System.out.println("Enter 1st No for Addtion of Number");
			a = scan.nextInt();
			System.out.println("Enter 2nd No for Addtion of Number");
			b = scan.nextInt();
			obj.addtionOfTwoNumber(a, b);
			break;
		
			case 2:
			System.out.println("Enter 1st No for Substraction of Number");
			a = scan.nextInt();
			System.out.println("Enter 2nd No for Substraction of Number");
			b = scan.nextInt();
			obj.substractionOfTwoNumber(a, b);
			break;
		
			case 3:
			System.out.println("Enter 1st No for Multiplication of Number");
			a = scan.nextInt();
			System.out.println("Enter 2nd No for Multiplication of Number");
			b = scan.nextInt();
			obj.multiplicationOfTwoNumber(a, b);
			break;
		
			case 4:
			System.out.println("Enter 1st No for Division of Number");
			a = scan.nextInt();
			System.out.println("Enter 2nd No for Division of Number");
			b = scan.nextInt();
			obj.divisionOfTwoNumber(a, b);
			break;
		
			case 5:
			System.out.println("Enter 1st No for Modulus of Number");
			a = scan.nextInt();
			System.out.println("Enter 2nd No for Modulus of Number");
			b = scan.nextInt();
			obj.modulusOfTwoNumber(a, b);
			break;
		
			case 6:
			System.out.println("Enter No to Calculate Square of Number");
			a = scan.nextInt();
			obj.squareOfNumber(a);
			break;
		
			case 7:
			System.out.println("Enter No to Calculate Cube of Number");
			a = scan.nextInt();
			obj.cubeOfNumber(a);
			break;
		
			case 8:
			System.out.println("Enter No 1st Number to calculate Average of Number");
			a = scan.nextInt();
			System.out.println("Enter No 2nd Number to to calculate Average of Number");
			b = scan.nextInt();
			obj.averageofnumbers(a, b);
			break;
		
			case 9:
			System.out.println("Enter No to calculate Factos of Number");
			a = scan.nextInt();
			obj.factorsofnumbers(a);
			break;
		
			case 10:
			System.out.println("Enter No to Even / Odd of Number");
			a = scan.nextInt();
			obj.findoutevenoroddnumber(a);
			break;
		
			default:
			System.out.println("Please Enter Correct Number");
		}
		tryMore();
	}

	public void tryMore() {
		System.out.println();
		System.out.println("Do you want to try Again... ");
		System.out.println("Press (Y) for Yes / (N) for No");
		char more = scan.next().charAt(0);
		
		if (more == 'Y' || more == 'y') {
			calulate();
		} else if (more == 'N' || more == 'n') {
			System.out.println("Thank you, Visit Again");
		} else {
			System.out.println("Invalid Input");
			tryMore();
		}
	}

	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		System.out.println("\t\t\tWelcome to Multipurpose Calculator");
		obj.calulate();
		
	}
}