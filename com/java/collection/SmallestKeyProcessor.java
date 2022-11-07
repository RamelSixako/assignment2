package com.java.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmallestKeyProcessor {

	public static void main(String[] args) {
		Map<String, Integer> ages = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the number of ages  you want to enter: ");
			int collectionSize = scanner.nextInt();
			for(int i = collectionSize ; i >= 1 ; i--) {
				System.out.print("Enter a name:");
				String name = scanner.next();
				System.out.print("Enter age:");
				Integer age = scanner.nextInt();
				ages.put(name, (age));
			}
		} catch (Exception e) {
			System.out.println("Somehting went wrong when retireving input:");
			System.out.println("Skipping input process:");
		}
		String  lowestKey = Collections.min(ages.keySet());
		System.out.println("Key: " + lowestKey + " ,Value: " + ages.get(lowestKey));
		ages.remove(lowestKey);
	}

}
