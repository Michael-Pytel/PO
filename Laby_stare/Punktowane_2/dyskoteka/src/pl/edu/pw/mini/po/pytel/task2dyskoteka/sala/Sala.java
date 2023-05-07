package pl.edu.pw.mini.po.pytel.task2dyskoteka.sala;

import java.util.LinkedHashSet;
import java.util.Set;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Uczestnik;

public class Sala implements SalaInterface {

	private int maxPojemnosc;
	private int aktualnaPojemnosc;
	private Set<Uczestnik> uczestnicy = new LinkedHashSet<>();

	public Sala(int maxPojemnosc) {
		this.maxPojemnosc = maxPojemnosc;
	}

	@Override
	public void addUczestnik(Uczestnik uczestnik) throws PelnaSalaException {
		uczestnicy.add(uczestnik);
		aktualnaPojemnosc++;
		if (aktualnaPojemnosc > maxPojemnosc) {
			throw new PelnaSalaException();
		}
	}

}
