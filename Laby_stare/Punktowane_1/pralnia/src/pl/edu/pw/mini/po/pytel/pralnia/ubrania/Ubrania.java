package pl.edu.pw.mini.po.pytel.pralnia.ubrania;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.Granat;
import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.Guzik;
import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.KartkaAdres;
import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.PocketItems;

public abstract class Ubrania {
	protected static Random random = new Random();
	protected boolean czystosc;
	protected List<PocketItems> kieszen = new LinkedList<>(); // Nie obchodzą nas duplikaty i często usuwamy

	public Ubrania() {
		setCzystosc(false);
		int iloscElementow = 1 + random.nextInt(3);
		for (int i = 0; i < iloscElementow; i++) {
			switch (random.nextInt(3)) {
			case 0:
				kieszen.add(new Guzik());
				break;
			case 1:
				kieszen.add(new Granat());
				break;
			default:
				kieszen.add(new KartkaAdres("Jakis adres"));
			}
		}

	}

	public Set<PocketItems> oproznijKieszen() {
		Set<PocketItems> result = new HashSet<>();

		result.addAll(kieszen);
		kieszen.clear();

		return result;
	}

	public void setCzystosc(boolean czystosc) {
		this.czystosc = czystosc;
	}
}
