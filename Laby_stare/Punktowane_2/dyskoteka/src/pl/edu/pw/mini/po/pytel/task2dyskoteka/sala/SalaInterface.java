package pl.edu.pw.mini.po.pytel.task2dyskoteka.sala;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Uczestnik;

public interface SalaInterface {
	void addUczestnik(Uczestnik uczestnik) throws PelnaSalaException;
}
