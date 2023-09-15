package org.lessons.java.valutazioni;

public class Studente {
	private int id, percentualeAssenze;
	private float mediaVoti;

	public Studente(int id, float mediaVoti, int percentualeAssenze) {
		this.id = id;
		this.mediaVoti = mediaVoti;
		this.percentualeAssenze = percentualeAssenze;
	}

	public boolean isPromoted() {
		boolean promoted = false;

		if (percentualeAssenze <= 50)
			if ((percentualeAssenze >= 25 && percentualeAssenze <= 50) && mediaVoti > 2)
				promoted = true;
			else if (percentualeAssenze < 25 && mediaVoti >= 2)
				promoted = true;

		return promoted;
	}

	public int getId() {
		return id;
	}

	public float getMediaVoti() {
		return mediaVoti;
	}

	public int getPercentualeAssenze() {
		return percentualeAssenze;
	}
}
