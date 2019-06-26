package de.cofinpro.sweng.schreibenapp.controller;

import de.cofinpro.sweng.schreibenapp.kernbanksystem.KernbankService;
import de.cofinpro.sweng.schreibenapp.kernbanksystem.ServiceRepository;
import de.confinpro.sweng.schreibenapp.domain.Kunde;
import de.confinpro.sweng.schreibenapp.domain.Schreiben;
import de.confinpro.sweng.schreibenapp.repository.LocalSchreibenRepository;
import de.confinpro.sweng.schreibenapp.repository.SchreibenRepository;

/**
 * Der {@link SchreibenController} ist für die Erstellung eines Schreibens
 * zuständig. Dabei werden die relevanten Kundendaten aus dem Kernbanksystem der Bank geladen
 * 
 * @author Dawid Kostrzycki
 *
 */
public class SchreibenController {

	private KernbankService kernbankService = ServiceRepository
			.getKernbankSerice();

	private SchreibenRepository schreibenRepo = new LocalSchreibenRepository();

	private Kunde empfaenger;
	private Schreiben schreiben;

	// new Line Property für die Verwendung in den Schreiben
	private final static String newline = System.getProperty("line.separator");

	/**
	 * Lädt das Schreiben mit der Id aus dem Schreiben Repository
	 * @param id
	 */
	public void loadSchreiben(String id) {
		this.schreiben = schreibenRepo.getSchreibenById(id);
	}

	/**
	 * lädt die Personendaten aus dem Kernbanksystem für den Empfänger des
	 * Briefes
	 * 
	 * @param kontonummer
	 */
	public void loadEmpfaenger(String kontonummer) {
		this.empfaenger = kernbankService.getPersonendaten(kontonummer);
	}
	
	/**
	 * Aktualisiert das aus dem Schreiben Repository geladene Schreiben mit 
	 * den Daten, die aus dem Kernbanksystem geladen werden.  
	 */
	public void populateSchreiben() {
		// Empfänger im Schreiben setzen
		schreiben.setEmpfaenger(empfaenger);

		// Variablen im Schreiben durch Werte aus dem Kernbanksystem ersetzten
		String kontonummer = empfaenger.getKontonummer();
		schreiben.setText(schreiben.getText().replace("{Kontonummer}",
				kontonummer));
		
		schreiben.setText(schreiben.getText().replace("{Saldo}",
				kernbankService.getKontoSaldo(kontonummer)));
		
		schreiben.setText(schreiben.getText().replace("{Restlaufzeit}",
				kernbankService.getRestlaufzeit(kontonummer)));
	}

	public void print() {
		StringBuffer buffer = new StringBuffer();

		// Empfängerdaten
		buffer.append(empfaenger.getVorname() + " " + empfaenger.getName());
		buffer.append(newline);
		buffer.append(empfaenger.getStrasse() + " "
				+ empfaenger.getHausnummer());
		buffer.append(newline);
		buffer.append(empfaenger.getPlz() + " " + empfaenger.getOrt());
		buffer.append(newline);
		buffer.append(newline);
		buffer.append(newline);

		// Betreff
		buffer.append(schreiben.getBetreff());
		buffer.append(newline);
		buffer.append(newline);

		// Anrede
		buffer.append(schreiben.getAnrede());
		buffer.append(newline);

		// Text
		buffer.append(schreiben.getText());
		buffer.append(newline);
		buffer.append(newline);
		buffer.append(newline);

		// Schlussteil
		buffer.append(schreiben.getSchlusssatz());
		buffer.append(newline);

		System.out.println(buffer.toString());
	}

}
