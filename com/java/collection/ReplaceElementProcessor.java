package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceElementProcessor {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the number of names  you want to enter: ");
			int collectionSize = scanner.nextInt();
			for (int i = 0; i < collectionSize; i++) {
				System.out.print("Enter a name:");
				String name = scanner.next();
				names.add(name);
			}
			System.out.print("Enter the postion you want to change");
			int position = scanner.nextInt();
			if (position < 0 || position - 1 > collectionSize) {
				System.out.println("There are no values that belong to this postion");
				System.exit(0);
			}
			System.out.print("Enter the  the new value(name)");
			String newValue = scanner.next();
			replaceValue(names, position, newValue);
		} catch (Exception e) {
			System.out.println("Somehting went wrong: " + e);
			System.exit(0);
		}

	}

	private static void replaceValue(List<String> names, int position, String newValue) {
		System.out.println("Old array");
		System.out.println(names.toString());
		names.set(position - 1, newValue);
		System.out.println("new array");
		System.out.println(names.toString());
	}
}
