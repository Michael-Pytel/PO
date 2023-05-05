package pl.edu.pw.mini.po.pytel.taks2samolot.samolot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.Bagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Pasazer;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Pilot;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Steward;

public class Samolot implements PasazerInterface {

	static Random random = new Random();
	protected Pilot pilot1;
	protected Pilot pilot2;
	protected int masaBazazow;

//	protected Map<Kolumny, ArrayList<Pasazer>> miejscaPasazerow = new HashMap<>(); // inny pomysl
	protected List<HashMap<String, Pasazer>> miejscaPasazerow = new ArrayList<>();
	protected List<Steward> miejscaStewardow = new LinkedList<>();
	protected Stack<Bagaz> luk = new Stack<>();

	// protected T obiektPrzymusuBezposredniego;

	public Samolot() {
		pilot1 = new Pilot();
		pilot2 = new Pilot();
		// this.obiektPrzymusuBezposredniego = obiektPrzymusuBezposredniego;
		for (int i = 0; i < 4; i++) {
			miejscaStewardow.add(new Steward());
		}
//		for (Kolumny col : Kolumny.values()) {
//			ArrayList<Pasazer> kolumna = new ArrayList<>();
//			for (int j = 0; j < 25; j++) {
//				kolumna.add(null);
//			}
//			miejscaPasazerow.put(col, kolumna);
//		}
		for (int i = 0; i < 25; i++) {
			miejscaPasazerow.add(new HashMap<>());
			for (int j = 0; j < 6; j++) {
				miejscaPasazerow.get(i).put(String.valueOf((char) ('A' + j)), null);
			}
		}

	}

	@Override
	public void wstawiaBagaz(Bagaz bagaz) {
		this.masaBazazow += bagaz.getMasa();
		luk.push(bagaz);
	}

	@Override
	public void boardPassenger(Pasazer pasazer, int rzad, String miejsce) throws MiejsceZajeteException {
		if (miejscaPasazerow.get(rzad).get(miejsce) != null) {
			throw new MiejsceZajeteException();
		} else {
			miejscaPasazerow.get(rzad).replace(miejsce, pasazer);
			System.out.println("Pasażer o id: " + pasazer.getId() + ", rząd: " + pasazer.getRzad() + ", miejsce: "
					+ pasazer.getMiejsce());
		}
	}

	@Override
	public boolean containsPassager(Pasazer pasazer) {
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 6; j++) {
				if (miejscaPasazerow.get(i).get(String.valueOf((char) ('A' + j))) != null) {
					if (miejscaPasazerow.get(i).get(String.valueOf((char) ('A' + j))).equals(pasazer)) {
						return true;
					}
				}
			}
		}
		return false;
	}


}
