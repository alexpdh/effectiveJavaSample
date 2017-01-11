/**
 * @Project Name:effectiveJavaSample
 * @File Name:Stack.java
 * @Package Name:com.sample.chapter05.item26.secondtechnique
 * @Date:2017年1月11日下午11:37:11
 *
*/

package com.sample.chapter05.item26.secondtechnique;

import java.util.Arrays;

import com.sample.chapter05.item26.firsttechnique.EmptyStackException;

/**
 * @ClassName:Stack
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年1月11日 下午11:37:11
 */
public class Stack<E> {
	private Object[] elements;
	private int size;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public Stack() {
		elements =  new Object[DEFAULT_INITIAL_CAPACITY];
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
		@SuppressWarnings("unchecked")
		E result =  (E) elements[--size];
		elements[size] = null;
		return result;
	}
}

