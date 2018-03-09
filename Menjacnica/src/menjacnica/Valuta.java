package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String nazivValute;
	private String skracenicaValute;
	private LinkedList<Kurs> kursneListe=new LinkedList<Kurs>();
	
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	
	
	public String getSkracenicaValute() {
		return skracenicaValute;
	}
	public void setSkracenicaValute(String skracenicaValute) {
		this.skracenicaValute = skracenicaValute;
	}
	
	
	public LinkedList<Kurs> getKursneListe() {
		return kursneListe;
	}
	public void setKursneListe(LinkedList<Kurs> kursneListe) {
		this.kursneListe = kursneListe;
	}
	
}
