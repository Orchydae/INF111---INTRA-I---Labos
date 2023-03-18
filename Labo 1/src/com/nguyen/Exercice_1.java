package com.nguyen;

import java.util.Scanner;

public class Exercice_1 {
	
	public static double Conversion_Fahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		
		System.out.println(Conversion_Fahrenheit(celsius));
		
	}

}
