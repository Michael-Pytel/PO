package pl.edu.pw.mini.po.pytel.pralnia.klient;

import java.util.Set;

import pl.edu.pw.mini.po.pytel.pralnia.pralnia.PodmiotPioracy;
import pl.edu.pw.mini.po.pytel.pralnia.pralnia.ZnalezionoOdbezpieczonyGranatException;
import pl.edu.pw.mini.po.pytel.pralnia.ubrania.Koszula;
import pl.edu.pw.mini.po.pytel.pralnia.ubrania.Kufajka;
import pl.edu.pw.mini.po.pytel.pralnia.ubrania.Plaszcz;
import pl.edu.pw.mini.po.pytel.pralnia.ubrania.Ubrania;

public class Klient {

	protected PodmiotPioracy podmiotPioracy;

	public Klient(PodmiotPioracy podmiotPioracy) {
		this.podmiotPioracy = podmiotPioracy;
	}

	public void doJob() {
		podmiotPioracy.putToWash(new Koszula());
		podmiotPioracy.putToWash(new Kufajka());
		podmiotPioracy.putToWash(new Plaszcz());

		try {
			podmiotPioracy.washAll();
			Set<Ubrania> wypraneUbrania = podmiotPioracy.pickUpWashedClothes();
			for (Ubrania ubrania : wypraneUbrania) {
				podmiotPioracy.getPocketStuffByClothes(ubrania);
			}
		} catch (ZnalezionoOdbezpieczonyGranatException znalezionoOdbezpieczonyGranatException) {
			znalezionoOdbezpieczonyGranatException.printStackTrace();
		}
	}
}
