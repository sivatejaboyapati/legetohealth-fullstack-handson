package day3;

public class PrimeMinister extends ChiefMinister implements StatePower,CountryPower {
	private String pmname;

	public String getPmname() {
		return pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
	}
	public void statebudget() {
		System.out.println("200 crores");
	}
	public void statepopulation() {
		System.out.println("6.79 crores");
	}
	public void countrybudget() {
		System.out.println("10000 crores");
	}
	public void countrypopulation() {
		System.out.println("138 crores");
	}

}
