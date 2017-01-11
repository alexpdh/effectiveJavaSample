/**
 * @Project Name:effectiveJavaSample
 * @File Name:Stack.java
 * @Package Name:com.sample.chapter05.item26.firsttechnique
 * @Date:2017年1月11日下午11:27:41
 *
*/

package com.sample.chapter05.item26.firsttechnique;

import java.util.Arrays;

/**
 * @ClassName:Stack
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年1月11日 下午11:27:41
 */
public class Stack<E> {
	private E[] elements;
	private int size;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
	public E pop() {
		if(size == 0)
			throw new EmptyStackException();
		E result =  elements[--size];
		elements[size] = null;
		return result;
	}
}

