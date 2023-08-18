package com.Kodnest.AssignmentProblem.TemperatureConversion;
import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to the Temperature Conversion Tool!");
	System.out.println("Select an option: ");
	System.out.println("=================================");
	System.out.println("1.Convert Celcius to farenheit");
	System.out.println("2.Convert farenheit to celcius");
	System.out.println("********************************");
	System.out.println("Enter the choice:");
	int num=scan.nextInt();

	switch(num)
	{
	case 1:
		
		System.out.println("Enter the temperature in Celsius:");
		 double celsius =scan.nextDouble();
		 double result=TemperatureConverter.celsiusToFarenheit(celsius);
		 System.out.println(celsius+" c is equivalent to"+result+" F");
		 break;
	
	case 2:
		System.out.println("Enter the temperature in Farenheit:");
		 double farenheit =scan.nextDouble();
		 double result2=TemperatureConverter.farenheitToCelsius(farenheit);
		 System.out.println(farenheit+" f is equivalent to "+result2+" oc");
		 break;
		
	
	
	}
	}
}
