package pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilet {
	private static List<String> miejsca = new ArrayList<>();
	private static List<String> rzedy = new ArrayList<>();
	private static List<ArrayList<String>> wolneMiejsca = new ArrayList<>();
	private int rzad;
	private String miejsce;

	static {
		for (int i = 0; i < 25; i++) {
			rzedy.add(String.valueOf(i));
		}
		for (int i = 0; i < 6; i++) {
			miejsca.add(String.valueOf((char) ('A' + i)));
		}
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 6; j++) {
				wolneMiejsca.add(new ArrayList<>());
				wolneMiejsca.get(wolneMiejsca.size() - 1).add(miejsca.get(j));
				wolneMiejsca.get(wolneMiejsca.size() - 1).add(rzedy.get(i));
			}
		}
	}

	public Bilet() {
		Collections.shuffle(wolneMiejsca);
		this.miejsce = wolneMiejsca.get(0).get(0);
		this.rzad = Integer.valueOf(wolneMiejsca.get(0).get(1));
		wolneMiejsca.remove(0);
	}

	public String getMiejsce() {
		return this.miejsce;
	}

	public int getRzad() {
		return this.rzad;
	}
}
