package com.demolinkedlist;

public class QueueNode<E> {

	public QueueNode next;
	public QueueNode pre;
	public E data;
		
	 public QueueNode(E val)
	 {
		 this.data = val;
		 this.next = null;
		 this.pre = null;
	 }
	  
	
}

