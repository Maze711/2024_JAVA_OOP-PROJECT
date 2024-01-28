
public class User {
//	private String name; Encapsulation
	String name;
	String membership;
	int age;
	
//	SETTER
	void set_name(String name) {
		this.name = name;
	}
//	GETTER
	String get_name() {
		return this.name;
	}
	
	void set_membership(String membership) {
		this.membership = membership;
	}
	
	void set_membership(Membership membership) {
		this.membership = membership.name();
	}
	
//	ENUM allows the programmer to code or give different options with alphanumeric
	public enum Membership{
		Bronze, Silver, Gold;
	}
	
	String get_membership() {
		return this.membership;
	}
	
}
