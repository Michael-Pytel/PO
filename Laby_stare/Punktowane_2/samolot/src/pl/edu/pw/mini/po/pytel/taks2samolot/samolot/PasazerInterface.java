package pl.edu.pw.mini.po.pytel.taks2samolot.samolot;

import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.Bagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Pasazer;

public interface PasazerInterface {
	void wstawiaBagaz(Bagaz bagaz);

	void boardPassenger(Pasazer pasazer, int rzad, String miejsce) throws MiejsceZajeteException;

	boolean containsPassager(Pasazer pasazer);
}
