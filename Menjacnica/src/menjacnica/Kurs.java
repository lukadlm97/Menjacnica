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
		if(datumIzdanjaListe==null)
			throw new RuntimeException("Datum izdavanja liste je null. ");
		this.datumIzdanjaListe = datumIzdanjaListe;
	}
	
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<0)
			throw new RuntimeException("Prodajni kurs je manji od nule. ");
		this.prodajniKurs = prodajniKurs;
	}
	
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<0)
			throw new RuntimeException("Srednji kurs je manji od nule. ");
		this.srednjiKurs = srednjiKurs;
	}
	
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<0)
			throw new RuntimeException("Kupovni kurs je manji od nule. ");
		this.kupovniKurs = kupovniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumIzdanjaListe == null) ? 0 : datumIzdanjaListe.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (datumIzdanjaListe == null) {
			if (other.datumIzdanjaListe != null)
				return false;
		} else if (!datumIzdanjaListe.equals(other.datumIzdanjaListe))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		String tekst="";
		tekst+="\n";
		tekst+="Kurs na dan: \n";
		tekst+="Datum: "+datumIzdanjaListe;
		tekst+="\n";
		tekst+="Prodajni kurs: "+prodajniKurs;
		tekst+="\n";
		tekst+="Srednji kurs: "+srednjiKurs;
		tekst+="\n";
		tekst+="Kupovni kurs: "+kupovniKurs;
		tekst+="\n";
		return tekst;
	}
}
