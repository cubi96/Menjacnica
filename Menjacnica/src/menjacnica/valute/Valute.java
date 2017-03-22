package menjacnica.valute;

import java.util.GregorianCalendar;

public class Valute {
	private String punNaziv;
	private String skracenica;
	private GregorianCalendar datumKursa;
	private double gornjiKurs;
	private double srednjiKurs;
	private double donjiKurs;

	public String getPunNaziv() {
		return punNaziv;
	}

	public void setPunNaziv(String punNaziv) {
		this.punNaziv = punNaziv;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}

	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}

	public void setDatumKursa(GregorianCalendar datumKursa) {
		this.datumKursa = datumKursa;
	}

	public double getGornjiKurs() {
		return gornjiKurs;
	}

	public void setGornjiKurs(double gornjiKurs) {
		this.gornjiKurs = gornjiKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}

	public double getDonjiKurs() {
		return donjiKurs;
	}

	public void setDonjiKurs(double donjiKurs) {
		this.donjiKurs = donjiKurs;
	}

}
