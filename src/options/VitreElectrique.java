package options;

import java.io.Serializable;

public class VitreElectrique implements Option,Serializable {

	public double getPrix() {
		return 212.35d;
	}
	
	public String getNom() {
		return "Vitre Electrique";
	}
	
}
