package com.vel.implementationclass;

import com.vel.interfacepackage.Addition;
import com.vel.interfacepackage.Averageofnumbers;
import com.vel.interfacepackage.Cube;
import com.vel.interfacepackage.Division;
import com.vel.interfacepackage.Factorsofnumbers;
import com.vel.interfacepackage.Findoutevenoroddnumber;
import com.vel.interfacepackage.Modulus;
import com.vel.interfacepackage.Multiplication;
import com.vel.interfacepackage.Square;
import com.vel.interfacepackage.Substraction;

public class CalculatorClass implements Addition, Substraction, Multiplication, Division, Modulus, Square, Cube,
		Averageofnumbers, Factorsofnumbers, Findoutevenoroddnumber {

	@Override
	public void findoutevenoroddnumber(int a) {
		// TODO Auto-generated method stub
		if (a % 2 == 0) {
			System.out.println("Even no " + a);
		} else {
			System.out.println("Odd no " + a);
		}
	}

	@Override
	public void factorsofnumbers(int a) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Factorial Numbers");
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Factor of Number" + a);
		} else {
			System.out.println("Not Factor of Number " + a);
		}
	}

	@Override
	public void averageofnumbers(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Average of two number is " + (a + b) / (2));
	}

	@Override
	public void cubeOfNumber(int a) {
		// TODO Auto-generated method stub
		System.out.println("Addition of two number is " + (a * a * a));
	}

	@Override
	public void squareOfNumber(int a) {
		// TODO Auto-generated method stub
		System.out.println("Square of a number is " + (a * a));
	}

	@Override
	public void modulusOfTwoNumber(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Modulus of two number is " + (a % b));
	}

	@Override
	public void divisionOfTwoNumber(int a, int b){
		// TODO Auto-generated method stub
		System.out.println("Division of two number is " + (a / b));
	}

	@Override
	public void multiplicationOfTwoNumber(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication of two number is " + (a * b));
	}

	@Override
	public void substractionOfTwoNumber(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Substraction of two number is " + (a - b));
	}

	@Override
	public void addtionOfTwoNumber(int a, int b) {
		// TODO Auto-generated method stub

		System.out.println("Addition of two number is " + (a + b));

	}

}