package menjacnica;


import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.InterfejsMenjacnica;
import menjacnica.valute.Valute;

public class Menjacnica implements InterfejsMenjacnica {
	LinkedList<Valute> valuta = new LinkedList<Valute>();

	@Override
	public void dodajKurs(GregorianCalendar datum, double donjiK, double gornjiK, double srednjiK, String naziv,
			String skracenica) {
		Valute v = new Valute();
		v.setDatumKursa(datum);
		v.setDonjiKurs(donjiK);
		v.setGornjiKurs(gornjiK);
		v.setPunNaziv(naziv);
		v.setSkracenica(skracenica);
		v.setSrednjiKurs(srednjiK);

		valuta.add(v);

	}

	@Override
	public void brisanjeKursa(GregorianCalendar datum, double donjiK, double gornjiK, double srednjiK, String naziv,
			String skracenica) {
		Valute v = new Valute();
		v.setDatumKursa(datum);
		v.setDonjiKurs(donjiK);
		v.setGornjiKurs(gornjiK);
		v.setPunNaziv(naziv);
		v.setSkracenica(skracenica);
		v.setSrednjiKurs(srednjiK);
		valuta.remove(v);
	}

	@Override
	public Valute vratiKurs(GregorianCalendar dan, String naziv) {
		for (int i = 0; i < valuta.size(); i++) {
			if (valuta.get(i).getPunNaziv().equals(naziv) && valuta.get(i).getDatumKursa().equals(dan)) {
				return valuta.get(i);
			}
		}
		return null;
	}

}
