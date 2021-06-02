package serializable_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	private Integer age;
	private Integer score;
	private transient String password; // this information will not be serialized.
	
	@Override
	public String toString() {
		return "Student:" + '\n' + 
				"name = " + this.name + '\n' + 
				"age = " + this.age + '\n' + 
				"score = " + this.score + '\n';
	}
	
	public void setName(String pName) {
		name = pName;
	}
	
	public void setAge(Integer pAge) {
		age = pAge;
	}
	
	public void setScore(Integer pScore) {
		score = pScore;
	}
	
	public void setPassword(String pPassword) {
		password = pPassword; 
	}
	
	
	
	public static void serialize() throws IOException{
		
		Student student = new Student();
		student.setName("abcd");
		student.setAge(18);
		student.setScore(1000);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("student.txt")));
		objectOutputStream.writeObject(student);
		objectOutputStream.close();
		
		System.out.println("Serialize successed! File student.txt created.");
		System.out.println("============================================================");
		
	}
	
	public static void deserialize() throws IOException, ClassNotFoundException{
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("student.txt")));
		Student student = (Student) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println("Result of deserializing: ");
		System.out.println(student);
		
	}

}
