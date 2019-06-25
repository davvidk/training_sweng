package de.confinpro.sweng.schreibenapp.domain;
/**
 * Eine Bean Klasse mit allen notwendigen Informationen des Briefempfängers
 * 
 * @author Dawid Kostrzycki
 *
 */
public class Kunde {

	private String name;
	private String vorname;
	private String strasse;
	private String hausnummer;
	private String plz;
	private String ort;
	private String kontonummer;
	
	public Kunde(String name, String vorname, String strasse,
			String hausnummer, String plz, String ort, String kontonummer) {
		this.name = name;
		this.vorname = vorname;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
		this.kontonummer = kontonummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getKontonummer() {
		return kontonummer;
	}
	
	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}
}
