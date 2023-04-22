package pl.edu.pw.punktowane01.elementy;

public abstract class Element {
	

public int signalReflection(int signalPower) throws IllegalArgumentException {
    if (signalPower < 0) {
        throw new IllegalArgumentException("nie poczuwamy się do kontynuowania pracy ");
    }
    return 1;
	}
}
