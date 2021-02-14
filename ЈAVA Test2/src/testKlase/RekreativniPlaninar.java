package testKlase;

public class RekreativniPlaninar extends Planinar {
	
	private int tezinaOpreme;
	private String nazivOkruga;
	private int maxUspon;
	
	RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String nazivOkruga, int maxUspon) {
		super(id, ime, prezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUspon = maxUspon;
	}
	
	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaxUspon() {
		return maxUspon;
	}

	@Override
	public int clanarinaPlaninara() {
		
		return 1000;
	}
	@Override
	public boolean uspesanUspon(Planina planina) {
	
		int maxUsponOprema = maxUspon - (tezinaOpreme * 50);
		
		if (maxUspon < planina.getVisinaPlanine() || maxUsponOprema < planina.getVisinaPlanine()) {
			
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public void stampaj() {
		
		System.out.println("Rekreativac, id: " + id + "\nime:" + ime + " " + prezime + "\nOkrug:" + nazivOkruga);
		
		
		
	}
	

}
