package pl.edu.pw.mini.po.pytel.task2dyskoteka.ochroniarze;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.hol.Hol;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.rejestr.RejestrObcych;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.sala.Sala;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.CzlowiekZZewnatrz;
import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.Uczestnik;

public class DuzyOchroniarz extends MalyOchroniarz {

	private RejestrObcych rejestrObcych;

	public DuzyOchroniarz(Sala malaSala, Sala duzaSala, Hol hol) {
		super(malaSala, duzaSala, hol);
		this.rejestrObcych = new RejestrObcych();
	}

	@Override
	public boolean check(Uczestnik uczestnik) {
		boolean hasEntered = super.check(uczestnik);

		if (hasEntered && uczestnik instanceof CzlowiekZZewnatrz) {
			if (rejestrObcych.canAdd((CzlowiekZZewnatrz) uczestnik)) {
				this.rejestrObcych.add((CzlowiekZZewnatrz) uczestnik);
			}
		}
		return hasEntered;

	}

	public void printStrangers() {
		System.out.println("Uczestnicy disco z zewnatrz: ");
		for (CzlowiekZZewnatrz osoba : rejestrObcych) {
			System.out.println(osoba);
		}
	}

}
