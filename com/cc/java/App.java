package com.cc.java;

public class App {

	// private static Mitarbeiter mitarbeiter;

	public static void main(String[] args) {
		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mustermann", "Max", "Manager", 2010);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Musterfrau", "Anna", "Entwicklerin", 2015);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Müller", "Maier", "Assistent", 2020);
	
		Mitarbeiter[] mitarbeiterListe = {mitarbeiter1, mitarbeiter2, mitarbeiter3};

        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {	
        }
		 
		mitarbeiter1.getInfo(mitarbeiter1);
	    // mitarbeiter2.getInfo(mitarbeiter2);
		// mitarbeiter3.getInfo(mitarbeiter3);
		
		System.out.println();
    }
	
	



}
