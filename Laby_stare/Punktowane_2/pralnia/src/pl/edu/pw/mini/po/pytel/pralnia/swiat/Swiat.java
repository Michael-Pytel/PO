package pl.edu.pw.mini.po.pytel.pralnia.swiat;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.pytel.pralnia.klient.Klient;
import pl.edu.pw.mini.po.pytel.pralnia.pralnia.Certyfikat;
import pl.edu.pw.mini.po.pytel.pralnia.pralnia.PodmiotPioracy;
import pl.edu.pw.mini.po.pytel.pralnia.pralnia.Pralnia;

public class Swiat {
	protected List<Klient> klienci = new ArrayList<>();



	public Swiat() {
		Certyfikat certyfikat = new Certyfikat();
		PodmiotPioracy podmiotPioracy = new Pralnia<Certyfikat>(certyfikat);
		for (int i = 0; i < 10; i++) {
			klienci.add(new Klient(podmiotPioracy));
		}
	}

	public void doJob() {
		for (Klient klient : klienci) {
			klient.doJob();
		}
	}
}
