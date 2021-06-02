package enum_examples;

import java.util.EnumSet;

public class EnumSetExamples {
	
	EnumSet<RoleEnum> userRolesForAdmin = EnumSet.of(
			RoleEnum.ROLE_ROOT_ADMIN,
			RoleEnum.ROLE_ORDER_ADMIN);

	Boolean isAdmin(User user) {
		return userRolesForAdmin.contains(user.getUserRole());
	}
	
}
