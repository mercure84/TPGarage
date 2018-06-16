package garage;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import options.Option;
import voitures.Vehicule;

public class Garage {

	List<Vehicule> voitures = new ArrayList();;

	public Garage() {

	}
/**
 * affiche le garage
 */
	public String toString() {

		Iterator<Vehicule> it = voitures.iterator();
		String description = "";

		while (it.hasNext()) {

			Vehicule v = it.next();
			description += v.toString() + "\n";

		}

		return description;

	}
/**
 * ajoute une voiture dans le garage et la sauvegarde dans le fichier save.txt
 * @param voiture
 */
	public void addVoiture(Vehicule voiture) {

		voitures.add(voiture);
		
		// ajout des véhicules dans le ficher save.txt
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("sauvegarde/save.txt"))));
			
		oos.writeObject(voiture);
		
		oos.close();
					
		}catch (FileNotFoundException e) {
		      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }  

	}


}
