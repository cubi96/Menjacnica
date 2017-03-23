package interfejs;

import java.util.GregorianCalendar;

import menjacnica.valute.Valute;

public interface InterfejsMenjacnica {
	public void dodajKurs(GregorianCalendar datum, double donjiK, double gornjiK, double srednjiK, String naziv, String skracenica);
	public void brisanjeKursa(GregorianCalendar datum, double donjiK, double gornjiK, double srednjiK, String naziv,
			String skracenica);
	public Valute vratiKurs(GregorianCalendar dan, String naziv);
}
