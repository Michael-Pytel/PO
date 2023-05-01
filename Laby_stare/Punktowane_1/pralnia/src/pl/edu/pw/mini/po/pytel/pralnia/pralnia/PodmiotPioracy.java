package pl.edu.pw.mini.po.pytel.pralnia.pralnia;

import java.util.Set;

import pl.edu.pw.mini.po.pytel.pralnia.pocketitems.PocketItems;
import pl.edu.pw.mini.po.pytel.pralnia.ubrania.Ubrania;

public interface PodmiotPioracy {
	void putToWash(Ubrania ubrania);

	void washAll() throws ZnalezionoOdbezpieczonyGranatException;

	Set<Ubrania> pickUpWashedClothes();

	Set<PocketItems> getPocketStuffByClothes(Ubrania ubrania);
}
