package de.confinpro.sweng.schreibenapp.repository;

import java.util.ArrayList;
import java.util.List;

import de.confinpro.sweng.schreibenapp.domain.Schreiben;

public class LocalSchreibenRepository implements de.confinpro.sweng.schreibenapp.repository.SchreibenRepository {

	private List<Schreiben> schreiben = new ArrayList<Schreiben>();

	public LocalSchreibenRepository() {
		init();
	}
	
	//TODO Factory Klasse für Schreiben implementieren
	private void init() {

		schreiben
				.add(new Schreiben("1",
						"Ratenaussetzung",
						"Sehr geehrte Damen und Herren,",
						"Ihre Ratenaussetzung",
						"wir folgen Ihrem Wunsch und genehmigen die Ratenaussetzung für Ihr Darlehen mit der Kontonummer: {Kontonummer}.\n"
						+ "Ihr jetziger Saldo beträgt: {Saldo}", 
						"Mit freundlichen Grüßen Ihre Bank AG"
						));
		
		schreiben
		.add(new Schreiben("2",
				"Widerruf",
				"Sehr geehrte Damen und Herren,",
				"Ihr Wideruf",
				"wir nehmen ihren Widerruf zum Darlehen mit der Kontonummer {Kontonummer} an.", 
						"Mit freundlichen Grüßen Ihre Bank AG"
				));
		
		schreiben
		.add(new Schreiben("3",
				"Ratenaussetzung",
				"Sehr geehrte Damen und Herren,",
				"Ihr Wunsch auf Ratenaussetzung",
				"Gerne nehmen wir Ihren Wunsch auf Aussetzung des Darlehens entgegen.", 
				"Mit freundlichen Grüßen Ihre Bank AG"
				));
	}

	public List<Schreiben> getAllSchreiben() {
		return schreiben;
	}

	public Schreiben getSchreibenById(String id) {
		for (Schreiben s : schreiben) {
			if (id.equals(s.getId()))
				return s;
		}
		return null;
	}

	public List<Schreiben> getSchreibenByName(String name) {
		List<Schreiben> filteredSchreiben = new ArrayList<Schreiben>();
		for (Schreiben s : schreiben) {
			if (s.getName() != null && s.getName().contains(name)) {
				filteredSchreiben.add(s);
			}
		}
		return filteredSchreiben;
	}
}
