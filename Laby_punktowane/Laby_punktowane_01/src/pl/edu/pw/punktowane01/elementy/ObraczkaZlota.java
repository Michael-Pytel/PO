package pl.edu.pw.punktowane01.elementy;

public class ObraczkaZlota extends Grawerowane{
	ObraczkaZlota(){
		
		proba = setProba(600,900);
		wygrawerowanie = setGrawer();
	}
	
	
	@Override
	public String toString() {
		return "Widelec Zloty [" + "proba: " + proba + ", grawer" + wygrawerowanie + "]";
	}
	
}
