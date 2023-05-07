package pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik;

public class CzlowiekZZewnatrz extends Uczestnik {
	public CzlowiekZZewnatrz() {
		super();
		setWiek(rand.nextInt(16, 41));
	}

	@Override
	protected boolean isMale() {
		return rand.nextBoolean();
	}

	@Override
	public String toString() {
		return "CzlowiekZZewnatrz [unikalneId=" + unikalneId + ", wiek=" + wiek + ", imie=" + imie + ", nazwisko="
				+ nazwisko + "]";
	}
}
