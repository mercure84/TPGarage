package moteur;

public class MoteurDiesel extends Moteur {

	
	
	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		type = TypeMoteur.DIESEL;
		
	}
	
	
}
