package com.interview.programs.DataStructure.LinkedList;

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

public class CustomLinkedList<T> {

	private Node<T> head, tail;

	/**
	 * 
	 * @param data
	 * 
	 *             Insert the element at beggining , end and middle
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if (length() == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * 
	 * @param data
	 * 
	 *             insert the element at biggining
	 */
	public void insertAtBiggining(T data) {
		Node<T> newNode = new Node<T>(data);
		if (length() == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	/**
	 * 
	 * @param data
	 * 
	 *             Insert the element at End
	 */
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if (length() == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * 
	 * @param pos
	 * @param data
	 * 
	 *             inser the element at given position
	 */
	public void insertAtPos(int pos, T data) {
		Node<T> newNode = new Node<T>(data);
		Node<T> current = head;
		if (pos == 0) {
			insertAtBiggining(data);
			return;
		}
		if (pos == length()) {
			insertAtEnd(data);
			return;
		}
		if (pos > length())
			throw new IndexOutOfBoundsException("The position is exceeded the list size");

		for (int i = 1; i < pos; i++)
			current = current.next;

		newNode.next = current.next;
		current.next = newNode;

	}

	/**
	 * 
	 * @param pos
	 * 
	 *            delete the element at given position
	 */
	public void deleteByPos(int pos) {
		if (length() == 0)
			throw new NullPointerException("List is empty");
		if (pos == 0) {
			head = head.next;
			return;
		}
		Node current = head;
		Node prev = current;
		for (int i = 0; i < pos; i++) {
			prev = current;
			current = current.next;
		}
		if (current == null)
			throw new IndexOutOfBoundsException("Position exceeded the list size");
		if (current == tail) {
			prev.next = null;
			tail = prev;
		} else
			prev.next = current.next;
	}

	/**
	 * 
	 * @param data
	 * 
	 *             Delete the given element
	 */
	public void deleteByVal(T data) {
		if (head == null)
			throw new NullPointerException("List is empty");
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node<T> current = head;
		Node<T> prev = current;

		while (current != null) {
			prev = current;
			current = current.next;
			if (current.data == data)
				break;
		}
		if (current == null)
			throw new NullPointerException("Given Value not present");
		prev.next = current.next;
	}

	/**
	 * reverse the given list
	 */
	public void reverse() {
		Node<T> prev=null;
		Node<T> next;
		Node<T> current = head;
		tail=current;
		while(current!=null) {
			next =current.next;
			current.next=prev;
			prev=current;
			current=next;			
		}
		head=prev;
	}

	/**
	 * display the elements in the list
	 */
	public void display() {
		if (length() == 0) {
			System.out.println("List is Empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	/**
	 * 
	 * @param pos to fetch the value
	 * @return the value for the position
	 */
	public T get(int pos) {
		if (length() == 0)
			throw new IndexOutOfBoundsException("List is Empty");
		if (pos >= length())
			throw new IndexOutOfBoundsException("Position exceeds the list size");
		Node<T> current = head;
		for (int i = 0; i < pos; i++)
			current = current.next;

		return current.data;
	}

	/**
	 * 
	 * @param pos to update the value
	 * @param val to update in the position
	 * @return the status of update
	 */
	public boolean update(int pos, T val) {
		if (length() == 0)
			return false;
		if (pos >= length())
			return false;

		Node<T> current = head;
		for (int i = 0; i < pos; i++)
			current = current.next;

		current.data = val;

		return true;
	}

	/**
	 * 
	 * @param data
	 * @return the index of the given value
	 */
	public int search(T data) {
		int i = -1;
		if (length() == 0) {
			return i;
		}
		Node current = head;
		boolean check = false;
		while (current != null) {
			i++;
			if (current.data == data) {
				check = true;
				break;
			}
			current = current.next;
		}
		if (check == true)
			return i;
		else
			return -1;
	}

	/**
	 * 
	 * @param data
	 * @return true whether the list contains the val
	 */
	public boolean contains(T val) {
		if (length() == 0) {
			return false;
		}
		Node current = head;

		while (current != null) {
			if (current.data == val)
				return true;
			current = current.next;

		}
		return false;

	}

	/**
	 * 
	 * @return the length of the list
	 */
	public int length() {
		int count = 0;
		Node<T> current = head;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
}