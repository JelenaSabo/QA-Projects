package testKlase;

public class Alpinista extends Planinar {
	
	private int poeniAlpiniste;
	
	

	Alpinista(int id, String ime, String prezime, int poeniAlpiniste) {
		super(id, ime, prezime);
		this.poeniAlpiniste = poeniAlpiniste;
	}
	
	public int getPoeniAlpiniste() {
		return poeniAlpiniste;
	}

	public void setPoeniAlpiniste(int poeniAlpiniste) {
		this.poeniAlpiniste = poeniAlpiniste;
	}


	@Override
	public int clanarinaPlaninara() {
		
		int clanarina = 1500; 
		
		if (poeniAlpiniste > 0) {
			
			clanarina = 1500 - (poeniAlpiniste * 50);
			
			return clanarina;
		} else {
			
			return clanarina;
		}
	
	
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		
		if (planina.getVisinaPlanine() < 4000) {
		
		return true;
	} else {
		return false;
	}
		
	}
	
	

	@Override
	public void stampaj() {
		
		System.out.println("Alpinista, id: " + id + "\nime: " + ime + " " + prezime + "\nBroj poena: " + poeniAlpiniste);
		
		
	}


}
