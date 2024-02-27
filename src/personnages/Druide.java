package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public static void main(String[] args) {
	    Druide druide = new Druide("Merlin", 5, 10);
	    
	    // _________Test des fonctions individellement_____________
	    
	    //String nomDruide = druide.getNom();
	    //System.out.println("Nom du druide : " + nomDruide);
	    
	    //druide.setNom("Gandalf");
	    //System.out.println("Nouveau nom du druide : " + druide.getNom());
	    
	    //druide.parler("Je suis un druide très puissant !");
	}

}