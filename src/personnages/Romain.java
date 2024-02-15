package personnages;

public class Romain {
	private String nom;
	private int force;

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	public void parler(String texte) {
		System.out.print(prendreParole() + "<<" + texte + ">>");
	}

	public String prendreParole() {
		return "Le Romain" + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne!");
		}
	}
	
	public static void main(String[] args) {
		// TODO dcp créer le main du romain
	}
}
