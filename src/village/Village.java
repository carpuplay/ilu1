package village;
import java.util.Arrays;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois == villageois.length) {
			System.out.println("Le village est deja plein!");
			return;
		}
		
		villageois[nbVillageois++] = gaulois;
		nbVillageois++;
		
		System.out.println("Le Gaulois" + gaulois.getNom() +  " à rejoint le village " + nom + "!");
		
	}

	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}

	public String toString() {
		return "Village [nom=" + nom + ", chef=" + chef + ", nbVillageois=" + nbVillageois + ", villageois="
				+ Arrays.toString(villageois) + "]";
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef + "vivent les légendaires gaulois:");
		
		for (int i=0; i < nbVillageois; i++) {
			System.out.println(villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village villageDesIrreductibles = new Village("Les irreductibles", 30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		
		villageDesIrreductibles.ajouterHabitant(asterix);
		
		Chef chef = new Chef("Abraracourcix",6,villageDesIrreductibles);
		
		Gaulois gaulois = villageDesIrreductibles.trouverHabitant(0);
		
		villageDesIrreductibles.toString();
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		villageDesIrreductibles.ajouterHabitant(obelix);
		villageDesIrreductibles.afficherVillageois();	
	}

}
