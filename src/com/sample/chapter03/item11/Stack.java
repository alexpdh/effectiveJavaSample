/**
 * Project Name:effectiveJavaSample
 * File Name:Stack.java
 * Package Name:com.sample.chapter03.item11
 * Date:2016年12月11日下午11:27:53
 *
*/

package com.sample.chapter03.item11;

import java.util.Arrays;

/**
 * ClassName:Stack
 * Function: A cloneable version of Stack .
 * Date:     2016年12月11日 下午11:27:53
 *
 * @author   Administrator
 * @version
 */
public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Stack clone() {
		try {
			Stack result = (Stack) super.clone();
			result.elements = elements.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	// Ensure space for at least one more element.
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	// To see that clone works, call with several command line arguments
	public static void main(String[] args) {
		Stack stack = new Stack();
		for (String arg : args)
			stack.push(arg);
		Stack copy = stack.clone();
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
		while (!copy.isEmpty())
			System.out.print(copy.pop() + " ");
	}
}

