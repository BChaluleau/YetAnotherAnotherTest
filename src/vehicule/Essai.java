package vehicule;

public class Essai {

	public static void main(String[] args) {
		System.out.println("Début du programme...");
		Voiture v = new Voiture("Tesla", 200);
		v.accelerer(20);
		v.accelerer(80);
		v.accelerer(150);
		v.accelerer(100);
		v.marcheArriere();
		v.accelerer(-100);
		v.accelerer(-100);
		v.marcheArriere();
		v.accelerer(30);
		v.accelerer(30);
		v.accelerer(30);

		Voiture v2 = new Voiture("2CV", 80);
		v2.accelerer(20);
		v2.accelerer(80);
		v2.accelerer(150);

	}

}
