package com.interview.programs.DataStructure.LinkedList;

import java.util.Scanner;

public interface LinkedListDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();

		while (true) {
			System.out.println();
			System.out.println("\n===========Menu=======");
			System.out.println("1.Insert the Series uptpo 10");
			System.out.println("2.Insert at beggining");
			System.out.println("3.Insert at end");
			System.out.println("4.Insert at position");
			System.out.println("5.Delete by position");
			System.out.println("6.Delete by value");
			System.out.println("7.Reverse the List");
			System.out.println("10.Display the list");
			System.out.println("11.Search");
			System.out.println("12.Contains");
			System.out.println("13.Get");
			System.out.println("14.Length");
			System.out.println("15.Exit");
//			System.out.println("");
//			System.out.println("");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < 10; i++)
					customLinkedList.insert(i + 1);
				break;
			case 2:
				System.out.println("Enter the element to be1"
						+ " insert At beggining");
				int start = sc.nextInt();
				customLinkedList.insertAtBiggining(start);
				break;
			case 3:
				System.out.println("Enter the element to be insert At end");
				int end = sc.nextInt();
				customLinkedList.insertAtEnd(end);
				break;
			case 4:
				System.out.println("Enter the position and element to be insert");
				int pos = sc.nextInt();
				int data= sc.nextInt();
				customLinkedList.insertAtPos(pos, data);
				break;
			case 5:
				System.out.println("Enter the position to be deleted");
				int pos1 = sc.nextInt();
				customLinkedList.deleteByPos(pos1);
				break;
			case 6:
				System.out.println("Enter the value to be deleted");
				int val = sc.nextInt();
				customLinkedList.deleteByVal(val);
				break;
			case 7:
				customLinkedList.reverse();
				break;
			case 10:
				customLinkedList.display();
				break;
			case 11:
				System.out.println("Enter the element to be search");
				int val1 = sc.nextInt();
				System.out.println("Index of the element " + val1 + " is " + customLinkedList.search(val1));
				break;
			case 12:
				System.out.println("Enter the element to be check");
				int contains = sc.nextInt();
				System.out.println(customLinkedList.contains(contains));
				break;
			case 13:
				System.out.println("Enter the index to get the value");
				int index = sc.nextInt();
				System.out.println(customLinkedList.get(index));
				break;
			case 14:
				System.out.println("Length of the linked list is " + customLinkedList.length());
				break;
			case 15:
				System.exit(0);
			default:
				System.out.println("Invalid Input");

			}

		}

	}
}
