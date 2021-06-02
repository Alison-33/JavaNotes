package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		String[] a = {"1", "2", "bilibili", "of", "codesheep", "5", "at", "BILIBILI", "codesheep", "23", "CHEERS", "6"}; 
		List<String> list = Arrays.asList(a);
		
		// We need to find all Strings that has length >= 5, ignore case, remove duplicates, remove pure number Strings, 
		// alphabetic ordering, and then use "*"  to link all the Strings into one.
		
		String result = list.stream()
				.filter(i -> !isNum(i)) // To check if the String is a number
				.filter( i -> i.length() >= 5)  // To check if the length is >= 5
				.map( i -> i.toLowerCase()) // Change the String to lower case
				.distinct() // Remove duplicates
				.sorted(Comparator.naturalOrder()) // Sort the Strings
				.collect( Collectors.joining("*")); // Join them by "*"
		
		System.out.println(result);
	}


	public static boolean isNum(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}

}
