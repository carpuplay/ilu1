package histoire;
import personnages.*;
import village.*;

import java.util.Random;

public class Scenario {

	public static void main(String[] args) {
		
		Romain minus = new Romain("Minus",6);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Random random1 = new Random();
		
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		int forcePotion = panoramix.preparerPotion(random1);
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(forcePotion);

		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		

	}

}
