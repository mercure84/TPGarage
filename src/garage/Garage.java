package garage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import options.Option;
import voitures.Vehicule;

public class Garage {
	
	List<Vehicule> voitures = new ArrayList(); ;
	
	public Garage() {
		
	}
	
	
	
	
	public String toString() {
		
		Iterator<Vehicule> it = voitures.iterator();
		String description = "";
				
		while (it.hasNext()) {
		
			Vehicule v = it.next();
			description += v.toString() + "\n";			
			
			
		}
		
		
		return description;
		
		

		
		}
		
		
	
	
	public void addVoiture(Vehicule voiture) {

		voitures.add(voiture);
		
	}

}
