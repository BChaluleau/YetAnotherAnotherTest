package vehicule;

public class Voiture {

	private String nom;
	private int vitesseMax;
	private boolean marcheArriere = false;
	private int vitesse;

	public Voiture(String nom, int vitesseMax) {
		this.nom = nom;
		this.vitesseMax = vitesseMax;
	}

	public void accelerer(int acceleration) {
		int maximum = marcheArriere ? 50 : vitesseMax;
		this.vitesse = min(this.vitesse + acceleration, maximum);
		System.out.println(nom + " vitesse:" + this.vitesse + "km/h");

	}

	private int min(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}

	public void marcheArriere() {
		if (!marcheArriere && this.vitesse > 0) {
			System.out.println(nom + " Impossible de passer la marche arrière");
			return;
		}
		marcheArriere = true;
		System.out.println(nom + " > marche arrière");
	}

}
