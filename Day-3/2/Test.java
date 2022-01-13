package day3;

public class Test {
	public static void main(String[] args) {
		StatePower sp=new ChiefMinister();
		sp.statebudget();
		sp.statepopulation();
		CountryPower cp=new PrimeMinister();
		cp.countrybudget();
		cp.countrypopulation();
		cp.statebudget();
		cp.statepopulation();
		
	}

}
