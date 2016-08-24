package pl.sadSUD.clockwork;

import java.util.Scanner;

public class SadSud 
{
	public static void main(String[] args) 
	{
		System.out.println("Witaj Wędrowcze! Podaj swoje imię!");
		Scanner podajImie = new Scanner(System.in);
		String imie = podajImie.nextLine();
	
		Lokacja startowa = new Lokacja();
		startowa.krotkiOpis = "Lokacja startowa";
		startowa.dlugiOpis = "Znajdujesz się na przykłądowej lokacji startowej";
				
		Gracz player = new Gracz();
		
		System.out.println(startowa.krotkiOpis);
		System.out.println(startowa.dlugiOpis);
		
		
	}
		
		
	
		

		
		

	

}
