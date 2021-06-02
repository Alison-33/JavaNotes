package enum_examples;


public class User {

	RoleEnum role;
		
	public User(RoleEnum pRole){
		role = pRole;
	}
		
	public RoleEnum getUserRole(){
		return role;
	}

}
