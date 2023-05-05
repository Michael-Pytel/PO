package pl.edu.pw.mini.po.pytel.taks2samolot.samolot;

@SuppressWarnings("serial")
public class MiejsceZajeteException extends Exception {
	public MiejsceZajeteException() {
		super("To miejsce jest już zajęte. Nie poczuwam się dalej do kontynuowania działania");
	}

}
