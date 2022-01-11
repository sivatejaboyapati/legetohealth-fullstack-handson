package day2;

public class Inherit_Person {
	private String name;
	private String gender;
	public Inherit_Person(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void display() {
		System.out.println("Name:" +name);
		System.out.println("Gender:"+gender);
	}

}
