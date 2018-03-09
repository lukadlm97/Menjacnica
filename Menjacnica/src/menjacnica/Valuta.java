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
		if(nazivValute==null)
			throw new RuntimeException("Naziv valute je null. ");
		this.nazivValute = nazivValute;
	}
	
	
	public String getSkracenicaValute() {
		return skracenicaValute;
	}
	public void setSkracenicaValute(String skracenicaValute) {
		if(skracenicaValute==null || skracenicaValute.length()>5)
			throw new RuntimeException("Skracenica valute je null ili je duza od 5 karaktera. ");
		this.skracenicaValute = skracenicaValute;
	}
	
	
	public LinkedList<Kurs> getKursneListe() {
		return kursneListe;
	}
	public void setKursneListe(LinkedList<Kurs> kursneListe) {
		if(kursneListe==null) {
			throw new RuntimeException("Lista sa kursnim listama za odgovarajucu valutu je prazna. ");
		}
		this.kursneListe = kursneListe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + ((skracenicaValute == null) ? 0 : skracenicaValute.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skracenicaValute == null) {
			if (other.skracenicaValute != null)
				return false;
		} else if (!skracenicaValute.equals(other.skracenicaValute))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String tekst="";
		tekst+="Naziv valute: "+nazivValute;
		tekst+="\n";
		tekst+="Skracenica valute: "+skracenicaValute;
		for(int i=0;i<kursneListe.size();i++) {
			kursneListe.get(i).toString();
		}
		return tekst;
	}
	
}
