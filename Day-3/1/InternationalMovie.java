package day3;

public class InternationalMovie extends Movie {
	private String country;
	private String language;
	public InternationalMovie(String country,String language,String mname, String producedby, String directedby, int duration, int year,
			String category) {
		super(mname, producedby, directedby, duration, year, category);
		this.country=country;
		this.language=language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
