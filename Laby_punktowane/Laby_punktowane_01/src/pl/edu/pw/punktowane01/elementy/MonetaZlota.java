package pl.edu.pw.punktowane01.elementy;

import java.util.Random;

public class MonetaZlota extends Zlote{
	private static int numerSeryjny = 101;
	private String rodzajMonety;
	private double nominal;
	RodzajeMonet rodzaj;
	Random random = new Random();
	
	MonetaZlota(){
		proba = setProba(800, 900);
		rodzajMonety = setRodzaj();
		setNominal();
		
		numerSeryjny++;
	}
	
	protected String setRodzaj() {
		int x = random.nextInt(0,4);
		return RodzajeMonet.values()[x].toString().toLowerCase(); 
	}
	
	protected void setNominal() {
		switch(random.nextInt(0,2)) {
		case 0: 
			nominal = 0.25;
			break;
		case 1:
			nominal = 0.5;
			break;
		default:
			nominal = (double) random.nextInt(1,101);
			break;
		}
	}

	@Override
	public String toString() {
		return "MonetaZlota [rodzajMonety=" + rodzajMonety + ", nominal=" + nominal + ", proba=" + proba + ", numerSeryjny:"  + numerSeryjny + "]";
	}
	
	@Override
	public int signalReflection(int signalPower) {
		return (int) Math.round(0.21 * signalPower);
	}
	
	
}
