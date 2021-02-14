package domaciZadatak;

public class Main {

	public static void main(String[] args) {
		
	  Igrac a1=new Igrac("Jovan", "Djordjevic", 1202005205489L, 2005, 1, "golman", false);
      Igrac a2=new Igrac("Janko", "Tot", 2002005152687L, 2005, 13, "levi bek", true);
      Trener a3=new Trener("Marko", "Markovic", 1512996825036l,1996,2,"pomocni");
      Trener a4=new Trener("Zivko", "Petrovic", 1811002825036l,2002,5,"kondicioni");
      
      a1.stampajIgraca();
      System.out.println("**********************************");
      a4.stampajTrenera();
      System.out.println("**********************************");
      a3.stampaj();
      System.out.println("**********************************");
      a2.stampajIgraca();
	}

}
