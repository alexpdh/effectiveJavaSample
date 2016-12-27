/**
 * @Project Name:effectiveJavaSample
 * @File Name:ForwardingSet.java
 * @Package Name:com.sample.chapter03.item16
 * @Date:2016年12月26日下午9:55:16
 *
*/

package com.sample.chapter04.item16;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName:ForwardingSet
 * @Function:  可重复使用的转发类
 * @version
 *
 * @author pengdh
 * @date: 2016年12月26日 下午9:55:16
 */
//Reusable forwarding class
public class ForwardingSet<E> implements Set<E> {
	private final Set<E> s;
	public ForwardingSet(Set<E> s) {
		this.s = s;
	}
	@Override
	public int size() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean equals(Object o) {
		return s.equals(o);
		
	}
	
	@Override
	public int hashCode() {
		return s.hashCode();
	}
	
	@Override
	public String toString() {
		return s.toString();
	}

}

