package menjacnica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import interfejs.InterfejsMenjacnica;
import menjacnica.valute.Valute;

public class Menjacnica implements InterfejsMenjacnica{
	ArrayList<Valute> val = new ArrayList<Valute>();
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
		val.add(v);
		
	}

	@Override
	public void brisanjeKursa(String skracenica, GregorianCalendar dan) {
		
		
	}

	@Override
	public Valute vratiKurs(GregorianCalendar dan, String naziv) {
		
		return null;
	}
	

}
