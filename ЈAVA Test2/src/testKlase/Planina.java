package testKlase;

public class Planina {
	
	private String imePlanine;
	private String nazivDrzave;
	private double visinaPlanine;
	
	
	Planina() {
		super();
	}


	Planina(String imePlanine, String nazivDrzave, double visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.nazivDrzave = nazivDrzave;
		this.visinaPlanine = visinaPlanine;
	}


	public String getImePlanine() {
		return imePlanine;
	}


	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}


	public String getNazivDrzave() {
		return nazivDrzave;
	}


	public void setNazivDrzave(String nazivDrzave) {
		this.nazivDrzave = nazivDrzave;
	}


	public double getVisinaPlanine() {
		return visinaPlanine;
	}


	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}
	
	
	

}
