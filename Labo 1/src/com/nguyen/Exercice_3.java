package com.nguyen;

import java.util.Scanner;

public class Exercice_3 {

	static final int HEURE = 3600;
	static final int MINUTE = 60;
	
	public static int heure_calcule(int secondes) {
		return secondes/HEURE;
	}
	
	public static int secondes_restantes(int secondes) {
		return secondes % 60;
		
	}
	
	public static int minutes_restantes(int secondes) {
		return (secondes % HEURE)/MINUTE;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int secondes = sc.nextInt();
		int secondes_rest = secondes_restantes(secondes);
		int minutes_rest = minutes_restantes(secondes);
		int heure_cal = heure_calcule(secondes);
		
		String sec_rest;
		String min_rest;
		String h_rest;
		
		if (secondes_rest < 10) {
			sec_rest = "0" + Integer.toString(secondes_rest);
		} 
		else {
			sec_rest = Integer.toString(secondes_rest);
		}
		
		if (minutes_rest < 10) {
			min_rest = "0" + Integer.toString(minutes_rest);
		}
		else {
			min_rest = Integer.toString(minutes_rest);
		}
		
		if (heure_cal < 10) {
			h_rest = "0" + Integer.toString(heure_cal);
		}
		else {
			h_rest = Integer.toString(heure_cal);
		}
		
		
		System.out.println(h_rest + ":" + min_rest  sec_rest);
	}

}
