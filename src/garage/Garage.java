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
		try {
		ObjectInputStream ois;
		ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("sauvegarde/save.txt"))));

			System.out.println(ois.readObject());

			System.out.println(ois.readObject());


		
		
		
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			
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
					new BufferedOutputStream(new FileOutputStream(new File("sauvegarde/save.txt"), true)));

			oos.writeObject(voiture);

			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
