package pl.edu.pw.mini.po.pytel.pralnia.pralnia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.Granat;
import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.PocketItems;
import pl.edu.pw.mini.po.pytel.pralnia.ubrania.Ubrania;

public class Pralnia implements PodmiotPioracy {

	protected Set<Ubrania> ubraniaPrzyjeteDoPrania = new HashSet<>(); // Kolejność wstawiania nie istotna, bez powtórzeń
	protected Set<Ubrania> ubraniaWyprane = new LinkedHashSet<>(); // Kolejność wstawiania istotna, brak powtórzeń
	protected Map<Ubrania, Set<PocketItems>> elementyZKieszeni = new HashMap<>(); // Relacja klucz-wartość

	@Override
	public void putToWash(Ubrania ubrania) {
		ubraniaPrzyjeteDoPrania.add(ubrania);

	}

	@Override
	public void washAll() throws ZnalezionoOdbezpieczonyGranatException {
		Iterator<Ubrania> iterator = ubraniaPrzyjeteDoPrania.iterator();
		while (iterator.hasNext()) {
			Ubrania ubrania = iterator.next();
			iterator.remove();
			Set<PocketItems> wyjeteElementy = new HashSet<>();

			for (PocketItems pocketItems : ubrania.oproznijKieszen()) {
				if (pocketItems instanceof Granat) {
					if (((Granat) pocketItems).isOdbezpieczony()) {
						throw new ZnalezionoOdbezpieczonyGranatException();
					}
				}
				wyjeteElementy.add(pocketItems);
			}
			elementyZKieszeni.put(ubrania, wyjeteElementy);
			ubrania.setCzystosc(true);
			ubraniaWyprane.add(ubrania);
		}

	}

	@Override
	public Set<Ubrania> pickUpWashedClothes() {
		Set<Ubrania> result = new LinkedHashSet<>();
		result.addAll(ubraniaWyprane);
		ubraniaWyprane.clear();

		return result;
	}

	@Override
	public Set<PocketItems> getPocketStuffByClothes(Ubrania ubrania) {
		Set<PocketItems> result = new HashSet<>();

		result.addAll(elementyZKieszeni.get(ubrania));
		elementyZKieszeni.remove(ubrania);

		return result;
	}

}
