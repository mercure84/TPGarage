package options;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	public double getPrix() {
		return 347.3;
	}
	
	public String getNom() {
		return "Climatisation";
	}
	
}
