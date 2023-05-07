package pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik;

public class Studentka extends Uczestnik {
	public Studentka() {
		super();
		setWiek(rand.nextInt(18, 27));

	}

	@Override
	public String toString() {
		return "Studentka [unikalneId=" + unikalneId + ", wiek=" + wiek + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ "]";
	}

	@Override
	protected boolean isMale() {
		return false;
	}
}
