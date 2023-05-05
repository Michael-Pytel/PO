package pl.edu.pw.mini.po.pytel.taks2samolot.bagaz;

import java.util.Objects;
import java.util.Random;

public abstract class Bagaz implements Comparable<Bagaz> {
	private int masa;
	private int id;
	private static int idPicker;
	protected static Random random = new Random();

	public Bagaz(int masa) {
		this.masa = masa;
		this.id = idPicker;
		idPicker++;
	}


	public int getMasa() {
		return this.masa;
	}

	public int getId() {
		return this.id;
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
		Bagaz other = (Bagaz) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Bagaz b) {
		int massComp = Double.compare(this.masa, b.masa);

		if (massComp != 0) {
			return masa - b.getMasa();
		} else {
			return Integer.compare(this.id, b.id);
		}

	}
}
