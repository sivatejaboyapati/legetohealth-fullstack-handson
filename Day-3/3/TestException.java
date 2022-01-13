package day3;

public class TestException {
	public static void main(String[] args) {
		try {
			UserObjects.searchUser(123);
		} catch(UserNotFound e) {
			System.out.println("User not available");
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}
		
	}
}
