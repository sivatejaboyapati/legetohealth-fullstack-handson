package day3;

public class UserObjects {
	static User[]u= {new User(119,"bob",20),new User(118,"alice",21)};
	static int count=0;
	public static void searchUser(int id) throws UserNotFound {
		for(User u1 : u) {
			if(id==u1.getUid()) {
				System.out.println(u1.getUname()+" "+u1.getAge()+" "+u1.getUid());
				break;
			} else {
				count++;
			}
		}
		if(count==u.length) {
			throw new UserNotFound();
		}
	}

}
