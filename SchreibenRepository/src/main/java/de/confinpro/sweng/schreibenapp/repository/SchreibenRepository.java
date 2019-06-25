package de.confinpro.sweng.schreibenapp.repository;
import java.util.List;

import de.confinpro.sweng.schreibenapp.domain.Schreiben;

/**
 * Zum Zugriff auf das Repository mit dem Schreiben wird die folgende
 * Schnittstelle angeboten.
 * 
 * @author Dawid Kostrzycki
 *
 */
public interface SchreibenRepository {

	/**
	 * Listet alle Schreiben im Repository auf
	 * 
	 * @return  {@link List} {@link Schreiben}
	 */
	List<Schreiben> getAllSchreiben();
	
	/**
	 * Liefert ein bestimmtes Schreiben anhand der Id 
	 * @param id
	 * @return {@link Schreiben}
	 */
	Schreiben getSchreibenById(String id);
	
	/**
	 * Liefert eine bestimmte Menge an Schreiben mit den übergebenen Namen enthalten
	 * 
	 * @param name
	 * @return {@link List} {@link Schreiben}
	 */
	List<Schreiben> getSchreibenByName(String name);

}
