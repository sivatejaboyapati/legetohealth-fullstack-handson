package day3;

public class ChiefMinister implements StatePower {
	private String cmname;

	public String getCmname() {
		return cmname;
	}

	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public void statebudget() {
		System.out.println("300 crores");
	}
	public void statepopulation() {
		System.out.println("35286757");
	}


}
