package pl.edu.pw.mini.po.pytel.task2dyskoteka.rejestr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.po.pytel.task2dyskoteka.uczestnik.CzlowiekZZewnatrz;

public class RejestrObcych implements Iterable<CzlowiekZZewnatrz> {
	private Map<String, HashSet<CzlowiekZZewnatrz>> rejestr = new HashMap<>();

	public boolean canAdd(CzlowiekZZewnatrz person) {
		if (rejestr.get(person.getImie()) == null) {
			return true;
		}
		if (rejestr.get(person.getImie()).contains(person)) {
			return false;
		}
		return true;
	}

	public void add(CzlowiekZZewnatrz osoba) {
		if(rejestr.containsKey(osoba.getImie())) {
			rejestr.get(osoba.getImie()).add(osoba);
		} else {
			rejestr.put(osoba.getImie(), new HashSet<>(List.of(osoba)));
		}
	}

	@Override
	public Iterator<CzlowiekZZewnatrz> iterator() {
		List<CzlowiekZZewnatrz> lista = new LinkedList<>();
		for (Set<CzlowiekZZewnatrz> imie : rejestr.values()) {
			lista.addAll(imie);
		}
		return lista.iterator();
	}

}
