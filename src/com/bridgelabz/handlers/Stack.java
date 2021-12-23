package com.bridgelabz.handlers;

import java.util.List;

public class Stack<T> {

	Object[] stack = new Object[6];
	int top;
	
	/**
	 *push the element into stack
	 * 
	 * @param data push data into stack
	 */
	public void push(Object data) {
		if (isFull()) {
			System.out.println("Stack is overflow");
		} else {
			stack[top] = data;
			top++;
		}

	}
	
	/**
	 * this method will push all the object into linked list
	 * 
	 * @param list list of object is provided from user
	 */
	public void pushAll(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			push(list.get(i));
		}

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
			top--;
			stack[top] = 0;

		}

	}
	
	/**
	 * show top element of stack
	 * 
	 * @return returns top data
	 */
	@SuppressWarnings("unchecked")
	public T peek() {
		T data;
		data = (T) stack[top - 1];
		return data;
	}

	/**
	 *check stack is empty or not
	 * 
	 * @return return true if empty else true
	 */
	public boolean isEmpty() {

		return top == 0;
	}
	
	/**
	 *check stack is full or not
	 * 
	 * @return return true if full else true
	 */
	public boolean isFull() {

		return top == stack.length;
	}

	/**
	 * show stack values
	 */
	public void show() {
		for (Object num : stack) {
			System.out.print(num + " ");
		}
		System.out.println();
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
