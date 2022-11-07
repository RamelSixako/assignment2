package com.java.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JoinCollectionProcessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter number of unique numbers you want for first collection: ");
			Integer size = scanner.nextInt();
			List<Integer> firstList = createNewList(size);
			System.out.print("Enter number of unique numbers you want for second collection: ");
			size = scanner.nextInt();
			List<Integer> secondList = createNewList(size);
			System.out.print("Enter element value(age) from first collection you wish for the join to start:");
			Integer elementValue = scanner.nextInt();
			joinCollections(firstList, secondList, elementValue);
		}catch(Exception $e) {
			System.out.println("Somehting went wrong when retireving input:");
		}
		

	}

	private static List<Integer> createNewList(int numberOfElements) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("Enter age:");
			Integer age = scanner.nextInt();
			System.out.println();
			list.add(age);
		}
		return list;
	}

	private static void joinCollections(List<Integer> firstList, List<Integer> secondList, int value) {
		System.out.println("First list");
		System.out.println(firstList.toString());
		System.out.println("Second list");
		System.out.println(secondList.toString());
		System.out.println(firstList.indexOf(value));
		if(firstList.indexOf(value) == -1) {
			System.out.println("Element does not exist in first list of elements . Stopping implemention of joining");
			return;
		}
		firstList.addAll(firstList.indexOf(value) + 1, secondList);
		System.out.println("Final list:");
		System.out.println(firstList.toString());
	}

}
