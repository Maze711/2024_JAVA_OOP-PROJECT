public class OOP {
	public static void main(String[] args) {
		User u = new User();
		u.set_name("Maze");
		u.set_membership(User.Membership.Gold);
		
		System.out.println(u.get_name());
		System.out.println(u.get_membership());
	}
}
