
public class AutoOlio {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		
		auto1.merkki= "Kottero";
		auto1.merkki= "Sedan xyz";
		auto1.bensanMaara= 1;
		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();

	}

} //Main luokan lopetus

class Auto {
	//ominaisuudet
	
	String merkki;
	String malli;
	int bensanMaara=0;
	
//metodit
	public void jarruta() {
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta() {
		if (bensanMaara >0)
		System.out.println("Auto kiihtyy");
		bensanMaara = (bensanMaara -1);
	
	}
	public void naytaTiedot() {
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
	}
}
