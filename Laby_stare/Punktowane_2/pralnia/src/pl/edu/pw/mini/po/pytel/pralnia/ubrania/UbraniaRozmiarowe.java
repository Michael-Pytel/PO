package pl.edu.pw.mini.po.pytel.pralnia.ubrania;

public abstract class UbraniaRozmiarowe extends Ubrania {

	protected int rozmiar;

	public UbraniaRozmiarowe() {
		rozmiar = 35 + random.nextInt(6);
	}
}
