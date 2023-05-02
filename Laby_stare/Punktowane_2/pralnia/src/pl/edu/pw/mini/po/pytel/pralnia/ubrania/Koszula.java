package pl.edu.pw.mini.po.pytel.pralnia.ubrania;

import java.util.LinkedHashSet;
import java.util.Set;

import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.Guzik;

public class Koszula extends UbraniaRozmiarowe {

	protected Set<Guzik> guziki = new LinkedHashSet<>(); // nie chcemy duplikatów i pamiętamy o kolejności

	public Koszula() {
		for (int i = 0; i < 6; i++) {
			guziki.add(new Guzik());
		}
	}
}
