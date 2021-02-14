package javaTest;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
		//Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
		//1 evro je 0,0085 dinara
		//1 franak je 0,0093 dinara
		//1 dolar je 0,010 dinara
		//Ispise vrsiti iskljucivo iz main metode
		        
		//Primeri ispisa u konzoli:
		        
		//Molim vas unesite iznos u dinarima: 
		//1200
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//evro
		//1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti
		//Primer ispisa u konzoli kad se unese pogresna valuta
		        
		//Molim vas unesite iznos u dinarima: 
		//123
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//zlato
		//Niste uneli dobru valutu
		
		double iznos;
		String valuta;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Molimo Vas, unesite iznos u dinarima: ");
		iznos = sc.nextDouble();
		
		System.out.println("Molimo Vas da unesete valutu u koju da konvertujemo dinare:  ");
		valuta = sc.next();
		
		double konvertovano = konverzija(iznos, valuta); 
		
		System.out.println(iznos + " dinara, kad se prebaci u " + valuta + ", iznosi " + konvertovano + " u toj valuti.");
	

	} 
	public static double konverzija(double unos, String novac) {
		switch (novac) {
		case "evro":
			return unos * 0.0085;
		case "franak":
			return unos * 0.0093;
		case "dolar":
			return unos * 0.010;
			
		default:
			return 0.0;
		}
	}

}
