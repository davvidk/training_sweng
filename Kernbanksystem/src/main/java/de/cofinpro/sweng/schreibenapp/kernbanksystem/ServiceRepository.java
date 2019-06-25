package de.cofinpro.sweng.schreibenapp.kernbanksystem;

public class ServiceRepository {
	
	//TODO Welches Pattern mag hier sinnvoll sein?
	public static KernbankService getKernbankSerice(){
		return new KernbankServiceImpl();
	}
}
