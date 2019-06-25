package de.confinpro.sweng.schreibenapp.domain;

/**
 * Eine Bean für die Repräsentation von Schreiben 
 * Ein Schreiben hat eine id und einen lesbaren Namen. 
 * Zusätzlich ist ein Schreiben wie folgt aufgebaut:
 * 
 * - Es enthält eine Bereich für den Empfänger  
 * - Eine Betreffzeile, Bsp:  Ihr Brief vom 26.01.2015 
 * - Eine Anredezeile, Bsp: Sehr geehrte Damen und Herren, 
 * - Einen spezifischen Text, Bsp: wir genehmigen Ihren Kredit in Höhe von 1111 € ...
 * - Einen Schlusssatz, Bsp: Mit freundlichen Grüßen, Ihre Bank AG
 * 
 * 
 * @author Dawid Kostrzycki
 *
 */
public class Schreiben {

	private String id;
	private String name;

	private Kunde empfaenger;

	private String anrede;

	private String betreff;

	private String text;

	private String schlusssatz;

	public Schreiben(String id, String name, String anrede, String betreff,
			String text, String schlusssatz) {
		this.id = id;
		this.name = name;
		this.anrede = anrede;
		this.betreff = betreff;
		this.text = text;
		this.schlusssatz = schlusssatz;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kunde getEmpfaenger() {
		return empfaenger;
	}

	public void setEmpfaenger(Kunde empfaenger) {
		this.empfaenger = empfaenger;
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getBetreff() {
		return betreff;
	}

	public void setBetreff(String betreff) {
		this.betreff = betreff;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSchlusssatz() {
		return schlusssatz;
	}

	public void setSchlusssatz(String schlusssatz) {
		this.schlusssatz = schlusssatz;
	}

}
