package enum_examples;

public enum UserRole {
	
	ROLE_ROOT_ADMIN("System admin", 000000),
	ROLE_ORDER_ADMIN("Order admin", 100000),
	ROLE_NORMAL("Normal user", 200000),
	;
	
	private final String roleName;
	private final Integer roleCode;
	
	UserRole(String pRoleName, Integer pRoleCode){
		roleName = pRoleName;
		roleCode = pRoleCode;
	}
	
	public String getRoleName() {
		return this.roleName;
	}
	
	public Integer getRoleCode() {
		return this.roleCode;
	}
	
	public static Integer getRoleCodeByRoleName(String roleName) {
		for (UserRole enums: UserRole.values()) {
			if(enums.getRoleName().equals(roleName)) {
				return enums.getRoleCode();
			}
		}
		return null;
	}

}
