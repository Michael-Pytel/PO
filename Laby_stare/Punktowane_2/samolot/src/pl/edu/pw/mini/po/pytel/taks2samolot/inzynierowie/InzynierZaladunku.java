package pl.edu.pw.mini.po.pytel.taks2samolot.inzynierowie;

import java.util.SortedSet;

import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.Bagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.samolot.Samolot;

public class InzynierZaladunku {
	private SortedSet<Bagaz> bagaze;
	private Samolot samolot;

	public InzynierZaladunku(SortedSet<Bagaz> bagaze, Samolot samolot) {
		this.samolot = samolot;
		this.bagaze = bagaze;
	}

	public void zaladujBagaze() {
		while (!bagaze.isEmpty()) {
			samolot.wstawiaBagaz(bagaze.last());
			System.out.println("Wstawiony bagaz o masie: " + bagaze.last().getMasa() + " id: " + bagaze.last().getId());
			bagaze.remove(bagaze.last());
		}
	}


}
