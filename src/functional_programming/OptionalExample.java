package functional_programming;

import java.util.Optional;

public class OptionalExample {
	
	
	// 2 layers of if-else are very complicated and messy
	public Integer getScoreOld(Student student) {
		if( student != null ) {
			Subject subject = student.getSubject();
			if (subject != null) {
				return subject.getScore();
			}
		}
		return null;
	}
	
	public Integer getScore(Student student) {
		return Optional.ofNullable(student)
				.map(Student::getSubject)
				.map(Subject::getScore)
				.orElse(null);
	}

	
	
}
