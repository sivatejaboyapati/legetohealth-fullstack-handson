package day3;

public class SpecialMovie extends Movie {
	public String TechforSound;
	public String TechforVisuals;
	public SpecialMovie(String TechforSound,String TechforVisuals,String mname, String producedby, String directedby, int duration, int year, String category) {
		super(mname, producedby, directedby, duration, year, category);
		this.TechforSound=TechforSound;
		this.TechforVisuals=TechforVisuals;
	}
	public String getTechforSound() {
		return TechforSound;
	}
	public void setTechforSound(String techforSound) {
		TechforSound = techforSound;
	}
	public String getTechforVisuals() {
		return TechforVisuals;
	}
	public void setTechforVisuals(String techforVisuals) {
		TechforVisuals = techforVisuals;
	}
	public String toString() {
		return "SpecialMovie [TechforSound=" + TechforSound + ", TechforVisuals=" + TechforVisuals + "]";
	}
	
	
}
