package com.nguyen;

import java.util.Scanner;

public class Exercice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double rayon = sc.nextDouble();
		double hauteur = sc.nextDouble();
		double volume_cyl = Math.PI * Math.pow(rayon, 2) * hauteur;
		
		System.out.println(volume_cyl);
		
	}
	
}
