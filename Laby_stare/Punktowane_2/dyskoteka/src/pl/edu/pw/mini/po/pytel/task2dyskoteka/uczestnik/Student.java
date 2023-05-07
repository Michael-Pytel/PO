package pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik;

public class Student extends Uczestnik {

	public Student() {
		super();
		setWiek(rand.nextInt(18, 27));
	}

	@Override
	public String toString() {
		return "Student [unikalneId=" + unikalneId + ", wiek=" + wiek + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ "]";
	}

}
