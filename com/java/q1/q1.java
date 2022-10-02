package com.java.q1;

import java.util.HashMap;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		HashMap<String, Integer> ages = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the number of ages  you want to enter: ");
			int collectionSize = scanner.nextInt();
			while (collectionSize >= 1) {
				System.out.print("Enter a name:");
				String name = scanner.next();
				System.out.print("Enter age:");
				Integer age = scanner.nextInt();
				ages.put(name, (age));
				collectionSize--;
			}
		} catch (Exception e) {
			System.out.println("Somehting went wrong when retireving input:");
			System.out.println("Skipping input process:");
		}
		String lowestKey = " ";
		for (String key : ages.keySet()) {
			if (lowestKey.isBlank()) {
				lowestKey = key;
				continue;
			}
			if (lowestKey.compareToIgnoreCase(key) > 0) {
				lowestKey = key;
			}
		}
		System.out.println("Key: " + lowestKey + " ,Value: " + ages.get(lowestKey));
		ages.remove(lowestKey);
	}

}
