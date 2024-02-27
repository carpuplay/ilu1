package personnages;

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

	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void parler(String texte) {
		System.out.print(prendreParole()+ "<<" + texte + ">>");
	}
	
	public String prendreParole() {
		return "Le Gaulois " + nom + ":" ;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("Asterix", 13);
		
		gaulois.parler("Ça va les gars?");

	}
}
