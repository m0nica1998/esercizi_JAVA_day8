package main;

import java.util.Random;

public class main {
 public static void main(String[] args) {
	// Creare un array di 10 interi randomici compresi tra 100 e 150. Stampare tutti
		// i valori contenuti nell'array (dopo averli inseriti). Stampare inoltre il
		// valore minimo, massimo e la media.
	 
	 Random rand = new Random();
	 
	 int[] random = new int[10];
	 int somma = 0;
	 int media = 0;
	
	 int max_temp = 100;
	 int min_temp = 150;
	 for (int i = 0; i<10; i++) {
		 int  r = rand.nextInt(100, 151);
		 random[i] = r;
		 System.out.println(random[i]);
		 somma = somma + random[i];
		
		 
		if(random[i] < min_temp) {
		
		min_temp = random[i];
			
			
		} 
    	if (random[i] > max_temp) {
			max_temp = random[i];
		}
	 }
	 System.out.println("il numero minimo è " + min_temp);
	 System.out.println("il numero massimo è " + max_temp);
	 media = somma / 10;
	 System.out.println(media);
	 
	 
 }
}
