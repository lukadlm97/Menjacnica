package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datumIzdanjaListe;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	
	
	public GregorianCalendar getDatumIzdanjaListe() {
		return datumIzdanjaListe;
	}
	public void setDatumIzdanjaListe(GregorianCalendar datumIzdanjaListe) {
		this.datumIzdanjaListe = datumIzdanjaListe;
	}
	
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	
	
}
