package pl.edu.pw.punktowane01.elementy;

import java.util.Random;

public class CiesielskiGwozc extends Gwozc{
	int iloscZeberek;
	Random rand = new Random();
	
	CiesielskiGwozc(){
		super();
		iloscZeberek = rand.nextInt(10,21);
	}

	@Override
	public String toString() {
		return "CiesielskiGwozc [iloscZeberek=" + iloscZeberek + ", polysk=" + polysk + ", dlugosc=" + dlugosc + "]";
	}
	
	

}
