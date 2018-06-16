package options;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

	public double getPrix() {
		return 29.9d;
	}
	
	public String getNom() {
		return "Barre de Toit";
	}
	
	
	public BarreDeToit() {
	}
	
}
