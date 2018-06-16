package moteur;

import java.io.Serializable;

public class Moteur implements Serializable {

	public TypeMoteur type;
	public String cylindre;
	public double prix;
	
	
	public Moteur(String cyl, double price) {
		cylindre = cyl;
		prix = price;
		
	}
	
	public String toString() {
		
		return null;
	}
	
	double getPrix() {
		return prix;
	}
	
}