package pl.edu.pw.mini.po.pytel.pralnia.pocketitems;

import java.util.Objects;

public class KartkaAdres extends PocketItems {

	protected int nrDomu;
	protected String ulica;

	public KartkaAdres(String ulica) {
		this.ulica = ulica;
		this.nrDomu = 1 + random.nextInt(222);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nrDomu, ulica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KartkaAdres other = (KartkaAdres) obj;
		return nrDomu == other.nrDomu && Objects.equals(ulica, other.ulica);
	}

}
