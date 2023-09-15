package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Studente[] studenti = new Studente[20];
		ArrayList<Studente> studentiPromossi = new ArrayList<Studente>(), studentiBocciati = new ArrayList<Studente>();
		float maxMediaVotiPromossi = -1, minMediaVotiBocciati = 10;
		int idMaxPromosso = 0, idMinBocciato = 0;

		for (int i = 0; i < 20; i++) {
			studenti[i] = new Studente(i + 1, random.nextFloat(5), random.nextInt(100) + 1);

			if (studenti[i].isPromoted()) {
				studentiPromossi.add(new Studente(studenti[i]));

				if (maxMediaVotiPromossi < studenti[i].getMediaVoti()) {
					maxMediaVotiPromossi = studenti[i].getMediaVoti();

					idMaxPromosso = studenti[i].getId();
				}
			} else {
				studentiBocciati.add(new Studente(studenti[i]));

				if (minMediaVotiBocciati > studenti[i].getMediaVoti()) {
					minMediaVotiBocciati = studenti[i].getMediaVoti();

					idMinBocciato = studenti[i].getId();
				}
			}

			System.out.println(studenti[i].getId() + ") La media dei voti dello studente è "
					+ String.format("%.2f", studenti[i].getMediaVoti()) + ", la sua parcentuale di assenze è "
					+ studenti[i].getPercentualeAssenze() + "%. Esito: "
					+ (studenti[i].isPromoted() ? "PROMOSSO." : "BOCCIATO."));
		}

		System.out.println("Id studente promosso con il voto più alto: " + idMaxPromosso + "." + System.lineSeparator()
				+ "Id studente bocciato con il voto più basso: " + idMinBocciato + ".");

		System.out.println(System.lineSeparator() + System.lineSeparator() + "Arrivederci!");
	}

}
