package domaciZadatak;

public class Trener extends Osoba {

	private int godineIskustva;
	private String tipTrenera;

	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trener(String ime, String prezime, long jmbg, int godinaRodjenja,int godineIskustva, String tipTrenera) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(short godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void stampajTrenera() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godineIskustva + ", " + this.tipTrenera + " trener.");
	}
}
