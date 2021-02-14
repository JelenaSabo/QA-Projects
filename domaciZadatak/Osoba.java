package domaciZadatak;

public class Osoba {

	private String ime;
	private String prezime;
	private long jmbg;//kada se koristi long, ne moze se dodati nula na pocetak, a to je problem.
	private int godinaRodjenja;

	Osoba() {
	}

	public Osoba(String ime, String prezime, long jmbg, int godinaRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public long getJmbg() {
		return jmbg;
	}

	public void setJmbg(long jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void stampaj() {
		System.out.println(
				"(" + this.ime + ") (" + this.prezime + "), (" + this.jmbg + "), (" + this.godinaRodjenja + ")");
	}
}
