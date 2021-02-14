package testKlase;

public class Main {

	public static void main(String[] args) {
		
		Planina zlatibor = new Planina("Zlatibor", "Srbija", 1496);
		
		Planinar[] planinari = new Planinar[6];
		
		planinari[0] = new RekreativniPlaninar(1, "Jelena", "Sabo", 10, "Sremski", 1300);
		planinari[1] = new RekreativniPlaninar(2, "Sladja", "Milovac", 15, "Backi", 1350);
		planinari[2] = new RekreativniPlaninar(3, "Sasa", "Vasiljevic", 20, "Backi", 1400);
		planinari[3] = new Alpinista(4, "Marko", "Brekic", 5);
		planinari[4] = new Alpinista(5, "Aleksandar", "Milenkovic", 7);
		planinari[5] = new Alpinista(6, "Milovan", "Pocek", 8);
		
		
		int sumaClanarina = 0;
		
		for (int i = 0; i < planinari.length; i++) {
			
			planinari[i].stampaj();
			
			System.out.println("Uspesan uspon: " + planinari[i].uspesanUspon(zlatibor));
			
			System.out.println("--------------------------------------------");
			
			
			sumaClanarina += planinari[i].clanarinaPlaninara();
		}
		
		System.out.println("Zbir svih clanarina je: " + sumaClanarina);

	}

}
