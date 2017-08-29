package com.qb.israel.collections;

import java.util.LinkedList;

public class DoublyLinkedListExample <E> {
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedListExample() {
		this.size = 0;
	}
	
	private class Node {
		E element; 
		Node next;
		Node prev;
		
		public Node(E element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev; 
		}
	}
	
	public int size() { return this.size; }
	public boolean isEmpty() { return (size==0);}
	
	public void addFirst(E element) {
		Node tmp = new Node(element, head, null);
		if(head!=null) { head.prev = tmp;}
		head = tmp;
		if(tail==null) {tail = tmp;}
		size++;
		System.out.println("Adding: " + element);
	}
	
	public void addLast(E element) {
		Node tmp = new Node(element, null, tail);
		if(tail != null) {tail.next = tmp;}
		tail=tmp;
		if(head==null){head=tmp;}
		size++;
		System.out.println("Adding last: " + element);
	}
	
	public void iterateForward() {
		System.out.println("Iteratinf forward");
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.element);
			tmp=tmp.next;
		}
	}
	
	public void iterateBackward() {
		System.out.println("Iterating backward");
		Node tmp = tail;
		while(tmp!=null) {
			System.out.println(tmp.element);
			tmp=tmp.prev;
		}
	}
	
	public static void main (String [] args) {
		LinkedList<String> lList = new LinkedList<>();
	}
}
