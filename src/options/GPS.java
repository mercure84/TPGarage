package options;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	public String getNom() {
		return "GPS";
	}	

	public double getPrix() {
		return 113.5d;
	}

}
