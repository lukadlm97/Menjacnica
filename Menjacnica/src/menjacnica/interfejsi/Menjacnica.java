package menjacnica.interfejsi;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Menjacnica {
	public void dodavanjeKursaValuteNaOdredjeniDan(Kurs kursZaUbacivanje);
	public void brisanjeKursaValuteNaOdredjeniDan(GregorianCalendar datumZaBrisanje);
	public Kurs vracanjeKursaNaOdredjeniDan(GregorianCalendar datumZaDobijanjeKursa);
}
