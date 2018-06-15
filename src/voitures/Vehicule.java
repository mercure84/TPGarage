package voitures;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import moteur.Moteur;
import options.Option;
/**
 * classe qui permet d'instancier un v�hicule ; est une classe m�re
 * @author julie
 *
 */
public class Vehicule implements Option {

	// variables de la classe

	double prix;
	String nom;
	List<Option> options = new ArrayList();;
	Marque nomMarque;
	Moteur moteur ;
	
	
	// constructeur v�hicule
	
	public Vehicule() {
			
	}
	
	
	/**
	 * m�thode qui renvoie la description du v�hicule
	 */
	public String toString() {
		String opt = "[";
		Iterator<Option> it = options.iterator();
		while (it.hasNext()) {
			Option o = it.next();
			opt += " "+o.getNom() + " (" + o.getPrix() +"�)";
			
		}
		opt+="]";
		
		String resultat = nom + " Moteur " + moteur.type +" "+ moteur.cylindre + " (" + moteur.prix + "�) " + opt + " d'une valeur de " + getPrix() + "�";
		return resultat;
		
	}
	/**
	 * m�dthode qui permet d'ajouter une option � un v�hicule
	 * @param opt : l'option � ajouter ! 
	 */
	public void addOption(Option opt) {
	List<Option> options = this.options;
	options.add(opt);

		}
	
	// accesseurs 
	Marque getMarque() {
		return nomMarque;
		
	}
	
	List<Option> getOptions(){
		
		return options;
	}
	/**
	 * retourne le prix total du v�hicule en tenant compte du prix du moteur et des options
	 */
	public double getPrix() {
		prix = moteur.prix;
		Iterator<Option> it = options.iterator();
		while (it.hasNext()) {
			Option o = it.next();
			prix += o.getPrix();
			
		}
		
		return prix;
		
	}
	public void setMoteur(Moteur mot) {
		moteur = mot;
		
	}


	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
