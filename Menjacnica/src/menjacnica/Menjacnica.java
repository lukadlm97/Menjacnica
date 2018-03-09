package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements menjacnica.interfejsi.Menjacnica{
	LinkedList<Valuta> valute=new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursaValuteNaOdredjeniDan(Valuta valuta, Kurs kurs) {
		if(kurs==null || valuta==null)
			throw new RuntimeException("Kurs je null ili je valuta null. ");
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getNazivValute().equals(valuta.getNazivValute()) ) {
				valute.get(i).getKursneListe().add(kurs);
			}
		}
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getNazivValute().equals(valuta.getNazivValute()) ) {
				valute.get(i).setKursneListe(kurs);
			}
		}
		
	}

	@Override
	public void brisanjeKursaValuteNaOdredjeniDan(GregorianCalendar datumZaBrisanje, Valuta valuta) {
		if(datumZaBrisanje==null || valuta==null) {
			throw new RuntimeException("Datum za brisanje je null ili je valuta null. ");
		}
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
		
		boolean obrisan1=false;
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getNazivValute().equals(valuta.getNazivValute())) {
				int k=valute.get(i).getKursneListe().size();
				for(int j=0;j<k;j++) {
					if(valute.get(i).getKursneListe().get(j).getDatumIzdanjaListe().equals(datumZaBrisanje)) {
						valute.remove(valute.get(i));
						obrisan1=true;
						break;
					}
				}
				if(obrisan1==true)
					break;
			}
		}
	}

	@Override
	public Kurs vracanjeKursaNaOdredjeniDan(GregorianCalendar datumZaDobijanjeKursa, Valuta valuta) {
		if(datumZaDobijanjeKursa==null || valuta==null)
			throw new RuntimeException("Datum za dobijanje kursa je null ili je valuta null. ");
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
