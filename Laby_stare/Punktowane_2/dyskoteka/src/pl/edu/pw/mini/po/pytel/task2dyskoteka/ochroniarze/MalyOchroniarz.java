package pl.edu.pw.mini.po.pytel.task2dyskoteka.ochroniarze;

import java.util.Random;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.hol.Hol;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.sala.PelnaSalaException;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.sala.Sala;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Uczestnik;

public class MalyOchroniarz {

	private Hol hol;
	private Sala malaSala;
	private Sala duzaSala;

	protected Random rand = new Random();

	public MalyOchroniarz(Sala malaSala, Sala duzaSala, Hol hol) {
		this.hol = hol;
		this.malaSala = malaSala;
		this.duzaSala = duzaSala;
	}

	public boolean check(Uczestnik uczestnik) {
		Sala sala;
		if (uczestnik.getWiek() >= 18) {
			switch (rand.nextInt(0, 2)) {
			case 0:
				sala = malaSala;
				break;
			default:
				sala = duzaSala;
			}
			try {
				sala.addUczestnik(uczestnik);
			} catch (PelnaSalaException e) {
				return false;
			}
			return true;
		}
		return false;
	}
}
