/**
 * @Project Name:effectiveJavaSample
 * @File Name:IntArrays.java
 * @Package Name:com.sample.chapter03.item18
 * @Date:2016年12月27日下午11:57:35
 *
*/

package com.sample.chapter04.item18;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName:IntArrays
 * @Function:骨架实现的具体实现  
 * @version
 *
 * @author pengdh
 * @date: 2016年12月27日 下午11:57:35
 */
//concrete implementation built atop skeletal implementation
public class IntArrays {
	static List<Integer> intArrayAsList(final int[] a) {
		if(a == null)
			throw new NullPointerException();
		return new AbstractList<Integer>() {
			public Integer get(int i) {
				return a[i]; //Autoboxing (Item 5)
			}
			
			@Override
			public Integer set(int i, Integer val){
				int oldVal = a[i];
				a[i] = val;
				return oldVal;
			}
			
			public int size() {
				return a.length;
			}
		};
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++)
			a[i] = i;
		List<Integer> list = intArrayAsList(a);

		Collections.shuffle(list);
		System.out.println(list);
	}
}

