package functional_programming;

import java.util.function.Consumer;
import java.util.function.Function;

public class CosumerAndFunctionExample {
	
	public static void main(String[] args) {
		Consumer<Comparable> c = System.out::println;
		c.accept("hello world");
		c.accept("hello codesheep");
		c.accept("bilibili cheers");
		
		c.andThen(c).andThen(c).accept("hello world");
		
		Function<Integer, Integer> f1 = i -> i+i;
		Function<Integer, Integer> f2 = i -> i*i;
		c.accept(f1.andThen(f2).apply(2));
	}
	
	
	

}
