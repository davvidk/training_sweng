package de.cofinpro.sweng.schreibenapp.kernbanksystem;

import java.util.HashMap;
import java.util.Map;

import de.confinpro.sweng.schreibenapp.domain.Kunde;

class KernbankServiceImpl implements KernbankService {

	Map<String, Kontodaten> data = new HashMap<String, Kontodaten>();

	public KernbankServiceImpl() {
		Kunde mueller = new Kunde("Müller", "Hans", "Berliner Str.", "12","12122", "Berlin", "6870198886");
		Kunde schmidt = new Kunde("Schmidt", "Peter", "Wiener Str.", "6d","60487", "Frankfurt a. Main", "6870198887");
		Kunde koenig = new Kunde("König", "Johannes", "Alxanderplatz", "5","13332", "Berlin","6870198888");

		Kontodaten muellerKontodaten = new Kontodaten(mueller, "84 Monate","120 €", "5.45,22 €");
		Kontodaten schmidtKontodaten = new Kontodaten(schmidt, "12 Monate","310 €", "15.33,13 €");
		Kontodaten koenigKontodaten = new Kontodaten(koenig, "36 Monate","150 €", "8.366,00 €");

		data.put("6870198886", muellerKontodaten);
		data.put("6870198887", schmidtKontodaten);
		data.put("6870198888", koenigKontodaten);

	}

	@Override
	public Kunde getPersonendaten(String kontonummer) {
		return data.get(kontonummer).getPerson();
	}

	@Override
	public String getKontoSaldo(String kontonummer) {
		return data.get(kontonummer).getSaldo();
	}

	@Override
	public String getRestlaufzeit(String kontonummer) {
		return data.get(kontonummer).getRestlaufzeit();
	}

	@Override
	public String getRate(String kontonummer) {
		return data.get(kontonummer).getRate();
	}

	private class Kontodaten {
		private Kunde person;
		private String restlaufzeit;
		private String rate;
		private String saldo;

		public Kontodaten(Kunde person, String restlaufzeit, String rate,
				String saldo) {
			this.person = person;
			this.restlaufzeit = restlaufzeit;
			this.rate = rate;
			this.saldo = saldo;
		}

		public Kunde getPerson() {
			return person;
		}

		public String getRestlaufzeit() {
			return restlaufzeit;
		}

		public String getRate() {
			return rate;
		}

		public String getSaldo() {
			return saldo;
		}
	}
}
