package com.bridgelabz.handlers;

public class StackImplementUsingLinkedList<T> {

	LinkedList<T> stack = new LinkedList<T>();
	public static int top = 0;
	
	/**
	 * push the element into stack
	 * 
	 * @param data push data into stack
	 */
	public void push(T data) {

		stack.add(data);
		top++;

	}
	
	/**
	 * pop the element from stack
	 * 
	 * @return returns data which is popped
	 */
	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			stack.deleteAtEnd();
			top--;

		}

	}
	
	/**
	 * show top element of stack
	 * 
	 * @return returns top data
	 */

	public T peek() {
		if (!isEmpty()) {
			T data;
			data = (T) stack.get(top);
			return data;
		}
		return null;

	}
	
	/**
	 * check stack is empty or not
	 * 
	 * @return return true if empty else true
	 */
	public boolean isEmpty() {

		return stack.isEmpty();
	}
	
	public void show() {
		stack.show();
	}

	/**
	 * method for showing list of stack without spaces
	 */
	public void showStackWithoutSpace() {
		stack.showListWithoutSpaces();
	}
	
	/**
	 * method for returning the string of stack list
	 * 
	 * @return returns the stack list without spaces
	 */
	public String returnStackWithoutSpaces() {
		return stack.returnListInString();
	}

	/**
	 * check size of stack
	 * 
	 * @return return the top value
	 */
	public int size() {
		return top;
	}

}
