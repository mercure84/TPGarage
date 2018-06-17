package garage;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import options.Option;
import voitures.Vehicule;

public class Garage implements Serializable {

	List<Vehicule> voitures = new ArrayList();;

	public Garage() {

	}

	/**
	 * affiche le garage
	 */
	public String toString() {

		System.out.println("*****************************");
		System.out.println("*   Garage OpenClassrooms   *");
		System.out.println("*****************************");

		// charge le fichier où sont sauvegardée les voitures : la lecture de ce fichier
		// donne un objet de type List<Vehicule> que l'ion va parcourir et afficher dans la console
		try {
			ObjectInputStream ois;
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("sauvegarde/save.txt"))));

			List<Vehicule> listeVehicules = new ArrayList();
			listeVehicules = (List<Vehicule>) ois.readObject();

			for (Vehicule voiture : listeVehicules) {
				System.out.println(voiture);
			}
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Aucune voiture n'a été garée :))");

		}

		return "";

	}

	/**
	 * ajoute une voiture dans le garage et la sauvegarde dans le fichier save.txt
	 * 
	 * @param voiture
	 */
	public void addVoiture(Vehicule voiture) {

		voitures.add(voiture);

		// enregistrement du garage dans le fichier(on enregistre l'ArrayList voitures)
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(new File("sauvegarde/save.txt"))));

			oos.writeObject(voitures);

			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
