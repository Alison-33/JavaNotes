package enum_examples;

import java.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;


public class EnumMapExamples {
	
	public static void main(String[] args) {
		Map<RoleEnum, Integer> userStatisticMap = new EnumMap<>(RoleEnum.class);
		List<User> userList = new ArrayList<>(); 
		
		// add some users to the list
		
		// calculate the total number of each role in the list
		for (User user : userList) {
			Integer num = userStatisticMap.get(user.getUserRole()); // using Integer type to prevent it being null (uninitialized)
			if(num != null) {
				userStatisticMap.put(user.getUserRole(), num+1);
			}
			else {
				userStatisticMap.put(user.getUserRole(),1);
			}
		}
	}
	
	
	
}
