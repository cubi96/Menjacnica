package menjacnica;

import java.util.GregorianCalendar;

import interfejs.InterfejsMenjacnica;
import menjacnica.valute.Valute;

public class Menjacnica implements InterfejsMenjacnica{

	@Override
	public void dodajKurs(GregorianCalendar datum, double donjiK, double gornjiK, double srednjiK, String naziv,
			String skracenica) {
		
		
	}

	@Override
	public void brisanjeKursa(String skracenica, GregorianCalendar dan) {
		
		
	}

	@Override
	public Valute vratiKurs(GregorianCalendar dan, String naziv) {
		
		return null;
	}
	

}
