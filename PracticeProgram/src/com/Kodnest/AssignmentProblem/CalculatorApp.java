package com.Kodnest.AssignmentProblem;

public class CalculatorApp {
	void calc(char character,int num1,int num2)
	{
	
	switch(character)
	{
	case '+':
		System.out.println("your addition value is: "+(num1+num2));
		break;
	case '-':
		System.out.println("your substraction value is: "+(num1-num2));
		break;
	case '*':
		System.out.println("your multiplication value is: "+(num1*num2));
		break;
	case '/':
		System.out.println("your division value is: "+(num1/num2));
		break;
	case '%':
		System.out.println("your modular value is: "+(num1%num2));
		break;
	default :
		System.out.println("please check your input");
	}
	}

}
