package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Studente[] studenti = new Studente[20];

		for (int i = 0; i < 20; i++) {
			studenti[i] = new Studente(i + 1, random.nextFloat(5), random.nextInt(100) + 1);

			System.out.println(studenti[i].getId() + ") La media dei voti dello studente è "
					+ String.format("%.2f", studenti[i].getMediaVoti()) + ", la sua parcentuale di assenze è "
					+ studenti[i].getPercentualeAssenze() + "%. Esito: "
					+ (studenti[i].isPromoted() ? "PROMOSSO." : "BOCCIATO."));
		}

		System.out.println(System.lineSeparator() + System.lineSeparator() + "Arrivederci!");
	}

}
