package de.cofinpro.sweng.schreibenapp.kernbanksystem;

import de.confinpro.sweng.schreibenapp.domain.Kunde;

/**
 * Schnitstelle zum Kernbanksystem. Das System bietet die Möglichkeit diverse
 * Daten zum Darlehen zu ermitteln. Dabei handelt es sich um die Adressdaten des
 * Kreditnehmers, den Saldo, die Restlaufzeit oder die aktuelle Rate.
 * 
 * @author Dawid Kostrzycki
 *
 */
public interface KernbankService {

	public Kunde getPersonendaten(String kontonummer);

	public String getKontoSaldo(String kontonummer);

	public String getRestlaufzeit(String kontonummer);

	public String getRate(String kontonummer);

}
