package pl.edu.pw.mini.po.pytel.pralnia.pocketitems;

import java.util.Objects;

public class Guzik extends PocketItems {

	private static int idCounter;
	protected int id;

	public Guzik() {
		id = idCounter++;
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
		Guzik other = (Guzik) obj;
		return id == other.id;
	}
}
