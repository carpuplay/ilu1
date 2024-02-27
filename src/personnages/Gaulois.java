package personnages;

import java.util.Random;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	public String prendreParole() {
<<<<<<< HEAD
		return "Le Gaulois" + nom + ":";
=======
		return "Le Gaulois " + nom + ":" ;
>>>>>>> 1b1373a67dc9964dddd4e2332ffb058ea8834b17
	}

	public void boirePotion(int forcePotion) {

		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		Romain minus = new Romain("Minus", 6);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Random random1 = new Random();
		int forcePotion = panoramix.preparerPotion(random1);

//		System.out.println(asterix.toString()); 

		System.out.println(asterix.getNom());
		asterix.parler("Bonjour !");
		asterix.frapper(minus);
		asterix.boirePotion(forcePotion);
=======
		Gaulois gaulois = new Gaulois("Asterix", 13);
		
		gaulois.parler("Ça va les gars?");

>>>>>>> 1b1373a67dc9964dddd4e2332ffb058ea8834b17
	}

}
