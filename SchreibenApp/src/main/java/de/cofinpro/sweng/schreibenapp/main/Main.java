package de.cofinpro.sweng.schreibenapp.main;

import de.cofinpro.sweng.schreibenapp.controller.SchreibenController;

/**
 * Die Client-Klasse, die die Erzeugung der Schreiben steuert.
 * 
 * @author Dawid Kostrzycki
 *
 */
public class Main {

	public static void main(String[] args) {

		SchreibenController controller = new SchreibenController();
		
		// Schreiben auswählen
		controller.loadSchreiben("1");

		// Kreditnehmerdaten über die Konotonummer laden
		controller.loadEmpfaenger("6870198886");

		//Daten aus dem Kernbanksystem in das Schreiben einfügen
		controller.populateSchreiben();
		
		// Schreiben drucken
		//TODO Implementierung einer Strategy zur Ausgabe in HTML
		controller.print();

	}
	
}
