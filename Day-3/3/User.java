package day3;

public class User {
	private int uid;
	private String uname;
	private int age;
	public User(int uid, String uname, int age) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.age = age;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", age=" + age + "]";
	}
	

}
