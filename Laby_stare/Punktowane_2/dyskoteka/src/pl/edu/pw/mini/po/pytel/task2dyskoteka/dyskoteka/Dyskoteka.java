package pl.edu.pw.mini.po.pytel.task2dyskoteka.dyskoteka;

import java.util.Iterator;
import java.util.Random;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.hol.Hol;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.ochroniarze.DuzyOchroniarz;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.ochroniarze.MalyOchroniarz;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.sala.Sala;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Uczestnik;

public class Dyskoteka {
	private Hol hol;
	private Sala malaSala;
	private Sala duzaSala;
	private MalyOchroniarz malyOchroniarz;
	private DuzyOchroniarz duzyOchroniarz;
	private Random random = new Random();
	public Dyskoteka() {
		hol = new Hol();
		malaSala = new Sala(51);
		duzaSala = new Sala(75);
		malyOchroniarz = new MalyOchroniarz(malaSala, duzaSala, hol);
		duzyOchroniarz = new DuzyOchroniarz(malaSala, duzaSala, hol);

	}

	public void inviteAll() {
		Iterator<Uczestnik> iter = hol.iterator();

		while (iter.hasNext()) {
			Uczestnik uczestnik = iter.next();
			boolean hasEntered = (random.nextInt(0, 2) == 1) ? malyOchroniarz.check(uczestnik)
					: duzyOchroniarz.check(uczestnik);
			if (hasEntered) {
				iter.remove();
			}
		}
	}

	public void goLive() {
		inviteAll();
		duzyOchroniarz.printStrangers();
	}

	public static void main(String[] args) {
		Dyskoteka dyskoteka = new Dyskoteka();
		dyskoteka.goLive();
	}
}
