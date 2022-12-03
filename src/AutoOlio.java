
public class AutoOlio {

	public static void main(String[] args) {
		

	}

} //Main luokan lopetus

class Auto {
	//ominaisuudet
	
	String merkki;
	String malli;
	int bensanMaara=10;
	
//metodit
	public void jarruta() {
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta() {
		System.out.println("Auto kiihtyy");
		bensanMaara = (bensanMaara -1);
	}
	public void naytaTiedot() {
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
	}
}
