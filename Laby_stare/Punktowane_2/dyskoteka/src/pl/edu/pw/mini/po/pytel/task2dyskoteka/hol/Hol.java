package pl.edu.pw.mini.po.pytel.task2dyskoteka.hol;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.CzlowiekZZewnatrz;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Student;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Studentka;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Uczestnik;

public class Hol implements Iterable<Uczestnik> {

	private List<Uczestnik> oczekujacy = new LinkedList<>();

	public Hol() {
		for (int i = 0; i < 33; i++) {
			oczekujacy.add(new Student());
			oczekujacy.add(new Studentka());
			oczekujacy.add(new CzlowiekZZewnatrz());
		}

	}

	@Override
	public Iterator<Uczestnik> iterator() {
		return oczekujacy.iterator();
	}
}
