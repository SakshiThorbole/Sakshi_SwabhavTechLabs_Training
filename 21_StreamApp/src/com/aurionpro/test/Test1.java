package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sakshi", "Sonu", "Adi", "Mummy", "Pappa");
		
		System.out.println("Sorted in ascending order: ");
		
		List<String> sortedNames = names.stream().sorted().limit(3).collect(Collectors.toList());
		
		sortedNames.stream().forEach((name)->System.out.println(name));
		
//		List<String> sortedNamesAsc = names.stream().filter(name -> name.contains("a")).sorted().limit(3).collect(Collectors.toList());
//		if (!sortedNamesAsc.isEmpty()) {
//            System.out.println("Sorted in ascending if name contains 'a': " + sortedNamesAsc);
//        }

		
		
		System.out.println("Sorted in descending order: ");
		
		List<String> sortedNamesDesc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		sortedNamesDesc.stream().forEach((name)->System.out.println(name));
		
		System.out.println("Names of students that contains less than or equal to 4 characters: ");
		
		List<String> sortedNamesCharacter = names.stream()
                								 .filter(name -> name.length() <= 4)
                								 .sorted()
                								 .collect(Collectors.toList());
		sortedNamesCharacter.forEach((name)->System.out.println(name));
	}

}
