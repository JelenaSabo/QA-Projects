package javaTest;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji racuna potrosnju goriva
		//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
		//Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na 100 kilometara,
		//kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
		//Primeri ispisa u konzoli:
        
		//Molim vas unesite distancu u kilometrima:
		//134
		//Molim vas unesite tip vozila: 
		//Kombi
		//Kombi na 134.0 km potrosi 14.74 litara goriva
		//Primer ispisa kad se unese pogresno vozilo
		        
		//Molim vas unesite distancu u kilometrima:
		//133
		//Molim vas unesite tip vozila: 
		//Tenk
		//Uneli ste pogresan tip vozila
		
		double distanca;
		String tipVozila; 
		double potrosnja = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Molimo Vas, unesite distancu u kilometrima: ");
		distanca = sc.nextDouble();
		
		System.out.println("Molimo Vas, unesite tip vozila (motor, automobil, kombi, kamion): ");
		tipVozila = sc.next();
		
		if (tipVozila.equals("motor") || tipVozila.equals("automobil") || tipVozila.equals("kombi") || tipVozila.equals("kamion")) {
		
		
		switch (tipVozila) {
		
		case "motor": {
			potrosnja = 5 * distanca / 100; 
			break;
		}	
		case "automobil": {
			potrosnja = 7 * distanca / 100;
			break;
		}
		case "kombi": {
				potrosnja = 11 * distanca / 100;
				break;
			}
		case "kamion": {
			potrosnja = 15 * distanca / 100;
			break;
			
			} default:
				break;
		}
		
		System.out.println(tipVozila + " na " + distanca + "km potrosi " + potrosnja + " litara goriva.");
		
		} 
	        else {
			System.out.println("Tip vozila nije validan");
	
	        }
			
		}
	
	
		
		



	}   
		
	


