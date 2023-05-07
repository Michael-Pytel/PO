package pl.edu.pw.mini.po.pytel.task2dyskoteka.sala;

public class PelnaSalaException extends Exception {
	PelnaSalaException() {
		super("Pełna sala, nie jestem zobowiązany do kontynuowania dzialania");
	}
}
