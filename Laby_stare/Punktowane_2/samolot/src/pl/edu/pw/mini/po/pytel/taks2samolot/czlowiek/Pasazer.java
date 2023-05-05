package pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek;

import java.util.Objects;

public class Pasazer extends Czlowiek {
	private static int idCounter;
	protected int id;
	private Bilet bilet;

	public Pasazer() {
		this.id = idCounter++;
		this.bilet = new Bilet();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasazer other = (Pasazer) obj;
		return id == other.id;
	}

	public int getRzad() {
		return bilet.getRzad();
	}

	public String getMiejsce() {
		return bilet.getMiejsce();
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		Pasazer pasazer = new Pasazer();
		System.out.println(pasazer.getRzad());
		System.out.println(pasazer.getMiejsce());
	}

}
