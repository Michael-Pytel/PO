package pl.edu.pw.mini.po.pytel.taks2samolot.swiat;

import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.GlownyBagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.bagaz.PodrecznyBagaz;
import pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek.Pasazer;
import pl.edu.pw.mini.po.pytel.taks2samolot.gazrurka.Gazrurka;
import pl.edu.pw.mini.po.pytel.taks2samolot.samolot.Samolot;
import pl.edu.pw.mini.po.pytel.taks2samolot.terminal.Terminal;

public class Swiat {
	public void go() {
		Gazrurka gazrurka = new Gazrurka();
		Samolot<Gazrurka> samolot = new Samolot<>(gazrurka);
		Terminal<Gazrurka> terminal = new Terminal<>(samolot);

		for (int i = 0; i < 120; i++) {
			if (i < 50) {
				PodrecznyBagaz bagPodr = new PodrecznyBagaz();
				GlownyBagaz bagGl = new GlownyBagaz();
				terminal.addBagaz(bagGl);
				terminal.addBagaz(bagPodr);
			}
			Pasazer pasazer = new Pasazer();
			terminal.addPasazer(pasazer);
		}
		terminal.board();
		terminal.zaladuj();
	}

	public static void main(String[] args) {
		Swiat swiat = new Swiat();
		swiat.go();
	}
}
