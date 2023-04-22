package pl.edu.pw.punktowane01.elementy;

public class WidelecZloty extends Grawerowane{
	private int waga;
	
	WidelecZloty(){
		waga = 0;
		proba = setProba(600,900);
		wygrawerowanie = setGrawer();
	}
	
	
	@Override
	public String toString() {
		return "Widelec Zloty [" + "waga: "+ waga + ", proba: " + proba + ", grawer" + wygrawerowanie + "]";
	}
	
}
