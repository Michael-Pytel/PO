package pl.edu.pw.punktowane01.elementy;

import java.util.Random;

public abstract class Grawerowane extends Zlote{
	
	
	protected String wygrawerowanie;
	
	protected String[] grawery = {"I LUV YOU", "Powodznia", "Yo!"};
	Random random = new Random();
	
	
	protected String setGrawer() {
		int i = random.nextInt(0, grawery.length);
		return grawery[i];
		
		 
	}
	@Override
	public int signalReflection(int signalPower){
		
		return (int) Math.round(Math.sqrt(signalPower));
	}

}
