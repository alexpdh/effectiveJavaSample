/**
 * Project Name:effectiveJavaSample
 * File Name:Stack.java
 * Package Name:com.sample.chapter02.item06
 * Date:2016年12月4日下午9:18:05
 *
*/

package com.sample.chapter02.item06;

import java.util.Arrays;

/**
 * ClassName:Stack
 * Function: TODO ADD 程序中隐藏一个内存泄漏.
 * Date:     2016年12月4日 下午9:18:05
 * @author   Administrator
 * @version
 */
public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAUL_INITAL_CAPACITY = 16;
	
	public Stack(){
		elements = new Object[DEFAUL_INITAL_CAPACITY];
	}
	
	public void push(Object e){
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		return elements[--size];
	}
	
	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 * 保证至少一个以上的空间，每一个数组需要增加一倍的容量
	 */
	private void ensureCapacity() {
		if(elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
		
	}
}

