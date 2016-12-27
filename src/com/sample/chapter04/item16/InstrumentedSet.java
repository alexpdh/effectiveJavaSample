/**
 * @Project Name:effectiveJavaSample
 * @File Name:InstrumentedSet.java
 * @Package Name:com.sample.chapter03.item16
 * @Date:2016年12月26日下午10:03:14
 *
*/

package com.sample.chapter04.item16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:InstrumentedSet
 * @Function:使用组合代替继承
 * @version
 *
 * @author pengdh
 * @date: 2016年12月26日 下午10:03:14
 */
//wrapper class - uses composition in place of inheritance
public class InstrumentedSet<E> extends ForwardingSet<E> {
	private int addCount;

	public InstrumentedSet(Set<E> s) {
		super(s);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	public static void main(String[] args) {
		InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<String>());
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}
