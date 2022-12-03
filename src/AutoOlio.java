
public class AutoOlio {

	public static void main(String[] args) {
		
		//Olion nimi
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Romu", "Lotjake",12 );
		
		
		//Attribuutit
		auto1.merkki= "Kottero";
		auto1.malli= "Sedan xyz";
		auto1.bensanMaara= 10;
		
				
		//Metodikutsut
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		auto1.tankkaa(5);
		auto2.naytaTiedot();
		auto2.kiihdyta();
		auto2.naytaTiedot();
		auto2.tankkaa(5);
		

	}

} //Main luokan lopetus

class Auto {
	//ominaisuudet
	
	String merkki;
	String malli;
	int bensanMaara;
	int bensanUusiMaara;
	
	//oletusmuodostin
	
	public Auto() {
		merkki="";
		malli="";
		bensanMaara=0;
	}
	//Parametrimuodostin
	public Auto (String merkinNimi, String mallinNimi, int bensanMaaraL) {
		merkki=merkinNimi;
		malli=mallinNimi;
		bensanMaara=bensanMaaraL;
	}
	
//Jarruta metodi
	public void jarruta() {
		System.out.println("Auto jarruttaa");
	}
	//tulostetaan auto kiihtyy ja vähennetään bensan määrää
	public void kiihdyta() {
		if (bensanMaara >0)
		System.out.println("Auto kiihtyy");
		bensanMaara = (bensanMaara -1);
	
	} //tulostetaan auton tiedot ja bensan määrä kiihdytyksen jälkeen
	public void naytaTiedot() {
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
	}
	//tankkaa metodi
	public void tankkaa (int tankkaus) {
		bensanUusiMaara=bensanMaara + tankkaus;
		
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + tankkaus);
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanUusiMaara);
		
	}
}
