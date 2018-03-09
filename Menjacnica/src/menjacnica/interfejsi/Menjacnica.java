package menjacnica.interfejsi;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface Menjacnica {
	public void dodavanjeKursaValuteNaOdredjeniDan(Valuta valuta,Kurs kurs);
	public void brisanjeKursaValuteNaOdredjeniDan(GregorianCalendar datumZaBrisanje,Valuta valuta);
	public Kurs vracanjeKursaNaOdredjeniDan(GregorianCalendar datumZaDobijanjeKursa,Valuta valuta);
}
