package enum_examples;

public class JudgeRole {
	public String judge(String roleName) {
		return RoleEnum.valueOf(roleName).op();
	}
}
