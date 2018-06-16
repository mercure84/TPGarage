package options;

import java.io.Serializable;

public class SiegeChauffant implements Option,Serializable {

	public double getPrix() {
		return 562.9d;
	}
	
	public String getNom() {
		return "Siège de Toit";
	}
	
}

