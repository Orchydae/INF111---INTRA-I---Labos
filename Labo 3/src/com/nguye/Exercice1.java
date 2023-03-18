package com.nguye;

public class Exercice1 {

	static double cel2Fah(double degre) {
		return (degre * 9/5) + 32;
	}
	
	static double fah2Cel(double degre) {
		return (degre - 32) * 5/9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("celsius to fahrenheit " + cel2Fah(2));
		System.out.println("fahrenheit to celcius " + fah2Cel(1));
	
	}

}
