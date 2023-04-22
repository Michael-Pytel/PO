package pl.edu.pw.punktowane01.elementy;

import java.util.Random;

public class Gwozc extends Element{
	Random rand = new Random();
	protected boolean polysk; 
	protected int dlugosc; 
	
	Gwozc(){
		this.dlugosc = setDlugosc(60, 80);
		this.polysk = setPolysk();
	}
	
	
	protected int setDlugosc(int min, int max) {
		return rand.nextInt(min, max +1);
	}
	
	protected boolean setPolysk() {
		return false;
	}


	@Override
	public String toString() {
		return "Gwozc [polysk=" + polysk + ", dlugosc=" + dlugosc + "]";
	}
	
	@Override
	public int signalReflection(int signalPower) throws IllegalArgumentException{
		if (signalPower < 0) {
	        throw new IllegalArgumentException("nie poczuwamy się do kontynuowania pracy ");
	    }
		return (int) Math.round(0.75 * signalPower);
	}
}
