package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements menjacnica.interfejsi.Menjacnica{
	LinkedList<Valuta> valute=new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursaValuteNaOdredjeniDan(Valuta valuta, Kurs kurs) {
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getNazivValute().equals(valuta.getNazivValute()) ) {
				valute.get(i).setKursneListe(kurs);
			}
		}
		
	}

	@Override
	public void brisanjeKursaValuteNaOdredjeniDan(GregorianCalendar datumZaBrisanje, Valuta valuta) {
		boolean obrisan=false;
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getNazivValute().equals(valuta.getNazivValute())) {
				int k=valute.get(i).getKursneListe().size();
				for(int j=0;j<k;j++) {
					if(valute.get(i).getKursneListe().get(j).getDatumIzdanjaListe().equals(datumZaBrisanje)) {
						valute.remove(valute.get(i));
						obrisan=true;
						break;
					}
				}
				if(obrisan==true)
					break;
			}
		}
	}

	@Override
	public Kurs vracanjeKursaNaOdredjeniDan(GregorianCalendar datumZaDobijanjeKursa, Valuta valuta) {
		Kurs trazeniKurs=new Kurs();
		trazeniKurs=null;
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getKursneListe().equals(valuta.getNazivValute())) {
				int k=valute.get(i).getKursneListe().size();
				for(int j=0;j<k;j++) {
					if(valute.get(i).getKursneListe().get(j).getDatumIzdanjaListe().equals(datumZaDobijanjeKursa)) {
						trazeniKurs=valute.get(i).getKursneListe().get(j);
					}
				}
			}
		}
		return trazeniKurs;
	}
	
	

}
