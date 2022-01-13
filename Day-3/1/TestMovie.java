package day3;

public class TestMovie {
	public static void main(String[] args) {
		Movie m=new Movie("Bahubali","shobu yarlagadda","SS Rajamouli",159,2017,"Action");
		Movie m1=new Movie("KGF","Vijay Kirgandur");
		SpecialMovie s=new SpecialMovie("Dolby Atmos","VFX","ROBO","Kalanidhi maran","Shankar",165,2011,"Action");
		System.out.println(m.showDetails());
		System.out.println(m.getMoviesCount());
		System.out.println(m.getMovieId());
		System.out.println(s);
		System.out.println(m1.showDetails());
		
	}
	

}
