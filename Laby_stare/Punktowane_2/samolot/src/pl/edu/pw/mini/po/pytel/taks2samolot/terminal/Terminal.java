package pl.edu.pw.mini.po.pytel.taks2samolot.terminal;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.Bagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Pasazer;
import pl.edu.pw.mini.po.pytel.taks2samolot.inzynierowie.HumanistycznyInzynierZaladunku;
import pl.edu.pw.mini.po.pytel.taks2samolot.inzynierowie.InzynierZaladunku;
import pl.edu.pw.mini.po.pytel.taks2samolot.samolot.Samolot;

public class Terminal<T> implements TerminalInterface {
	private SortedSet<Bagaz> bagaze = new TreeSet<>();
	private Set<Pasazer> pasazerowie = new LinkedHashSet<>();
	private Samolot<T> samolot;
	private InzynierZaladunku<T> inzZal;
	private HumanistycznyInzynierZaladunku<T> humInzZal;

	public Terminal(Samolot<T> samolot) {
		this.samolot = samolot;
		this.inzZal = new InzynierZaladunku<T>(bagaze, samolot);
		this.humInzZal = new HumanistycznyInzynierZaladunku<T>(bagaze, samolot, pasazerowie, samolot);
	}
	@Override
	public void addBagaz(Bagaz bagaz) {
		this.bagaze.add(bagaz);
	}

	@Override
	public void addPasazer(Pasazer pasazer) {
		pasazerowie.add(pasazer);

	}

	public void zaladuj() {
		this.inzZal.zaladujBagaze();
	}

	public void board() {
		this.humInzZal.rozsadzLudzi();
	}

}
