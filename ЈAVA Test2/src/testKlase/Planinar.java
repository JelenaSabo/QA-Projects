package testKlase;

public abstract class Planinar {
	
	protected int id;
	protected String ime;
	protected String prezime;
	
	Planinar(int id, String ime, String prezime) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
	}
	public int getId() {
		return id;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	
	public abstract void stampaj();
	

	
	public abstract int clanarinaPlaninara();
	
	


	
	public abstract boolean uspesanUspon(Planina planina);
	

}
