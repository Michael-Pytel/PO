package pl.edu.pw.mini.po.pytel.taks2samolot.inzynierowie;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.Bagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Pasazer;
import pl.edu.pw.mini.po.pytel.taks2samolot.samolot.MiejsceZajeteException;
import pl.edu.pw.mini.po.pytel.taks2samolot.samolot.PasazerInterface;
import pl.edu.pw.mini.po.pytel.taks2samolot.samolot.Samolot;

public class HumanistycznyInzynierZaladunku<T> extends InzynierZaladunku<T> {

	private Set<Pasazer> pasazerowie;
	private PasazerInterface pasazerInterface;

	public HumanistycznyInzynierZaladunku(SortedSet<Bagaz> bagaze, Samolot<T> samolot, Set<Pasazer> pasazerowie,
			PasazerInterface pasazerInterface) {
		super(bagaze, samolot);
		// TODO Auto-generated constructor stub
		this.pasazerowie = pasazerowie;
		this.pasazerInterface = pasazerInterface;
	}

	public void rozsadzLudzi() {
		Iterator<Pasazer> iter = pasazerowie.iterator();
		Pasazer pasazer;
		boolean biletValid;

		while (iter.hasNext()) {
			pasazer = iter.next();
			biletValid = true;
			try {
				pasazerInterface.boardPassenger(pasazer, pasazer.getRzad(), pasazer.getMiejsce());
			} catch (MiejsceZajeteException e) {
				System.out
						.println("Miejsce zajęte: rząd: " + pasazer.getRzad() + " , miejsce: " + pasazer.getMiejsce());
				biletValid = false;
			}

			if (biletValid) {
				iter.remove();
				System.out.println("Pasazer został przydzielony: rząd: " + pasazer.getRzad() + " miejsce: "
						+ pasazer.getMiejsce());
			}
		}
	}

}
