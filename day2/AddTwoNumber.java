package com.demo;

public class AddTwoNumber {
	void SumOfTwoNumbers() {
		int number1 = 10;
		int number2 = 20;
		int result = number1 + number2;
		System.out.print("Sum of two numbers " + result);
	}

}
class MainTest {
	public static void main(String arg[]) {
		AddTwoNumber object = new AddTwoNumber();
		object.SumOfTwoNumbers();
	}
}
