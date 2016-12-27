/**
 * @Project Name:effectiveJavaSample
 * @File Name:InstrumentedHashSet.java
 * @Package Name:com.sample.chapter03.item16
 * @Date:2016年12月26日下午9:14:47
 *
*/

package com.sample.chapter04.item16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * @ClassName:InstrumentedHashSet
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2016年12月26日 下午9:14:47
 */
//Broken Inappropriate use of inheritance
public class InstrumentedHashSet<E> extends HashSet<E> {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 541312015030179840L;
	//The number of attempted element insertions
	private int addCount = 0;
	
	public InstrumentedHashSet() {
		
	}
	
	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}
	
	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount +=c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
	
	public static void main(String[] args) {
		InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}

