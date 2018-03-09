package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements menjacnica.interfejsi.Menjacnica{
	LinkedList<Valuta> valute=new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursaValuteNaOdredjeniDan(Valuta valuta, Kurs kurs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brisanjeKursaValuteNaOdredjeniDan(GregorianCalendar datumZaBrisanje, Valuta valuta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vracanjeKursaNaOdredjeniDan(GregorianCalendar datumZaDobijanjeKursa, Valuta valuta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
