package pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public abstract class Uczestnik {
	protected int unikalneId;
	private static int idCounter;
	protected int wiek;
	protected String imie;
	protected String nazwisko;
	private List<String> imiona = new ArrayList<>();
	private List<String> nazwiska = new ArrayList<>();
	private String[] maleNames = { "James", "Robert", "John", "Michael", "David", "William", "Richard", "Joseph",
			"Thomas", "Charles" };
	private String[] femaleNames = { "Mary", "Patricia", "Jennifer", "Linda", "Elizabeth", "Barbara", "Susan",
			"Jessica", "Sarah", "Karen" };
	private String[] surnames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis",
			"Rodriguez", "Martinez" };
	protected Random rand = new Random();

	public Uczestnik() {
		if (isMale()) {
			Collections.addAll(imiona, maleNames);
		} else {
			Collections.addAll(imiona, femaleNames);
		}
		Collections.addAll(nazwiska, surnames);
		this.setImie(imiona.get(rand.nextInt(10)));
		this.setNazwisko(nazwiska.get(rand.nextInt(10)));
		this.setUnikalneId(idCounter++);
	}


	public String getImie() {
		return imie;
	}

	private void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	private void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getUnikalneId() {
		return unikalneId;
	}

	private void setUnikalneId(int unikalneId) {
		this.unikalneId = unikalneId;
	}

	protected boolean isMale() {
		return true;
	}

	public int getWiek() {
		return wiek;
	}

	protected void setWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(unikalneId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Uczestnik other = (Uczestnik) obj;
		return unikalneId == other.unikalneId;
	}

}
