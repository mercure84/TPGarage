package moteur;

import java.io.Serializable;

/**
 * classe moteur, mère des autres moteurs
 * @author julie
 *
 */
public class Moteur implements Serializable {

	public TypeMoteur type;
	public String cylindre;
	public double prix;
	
	
	protected Moteur(String cyl, double price) {
		cylindre = cyl;
		prix = price;
		
	}
	
	public String toString() {
		
		return null;
	}
	
	protected double getPrix() {
		return prix;
	}
	
}