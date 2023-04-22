package pl.edu.pw.punktowane01.elementy;

import java.util.Random;

public abstract class Zlote extends Element{
	protected int proba;
	Random random = new Random();
	
	
	public int setProba(int min, int max) {
		return random.nextInt(min, max+1);
	}
}
