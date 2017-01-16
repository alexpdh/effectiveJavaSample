/**
 * @Project Name:effectiveJavaSample
 * @File Name:Union.java
 * @Package Name:com.sample.chapter05.item28
 * @Date:2017年1月16日下午11:03:38
 *
*/

package com.sample.chapter05.item28;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:Union
 * @Function: Generic union method with wildcard types
 * @version
 *
 * @author pengdh
 * @date: 2017年1月16日 下午11:03:38
 */
public class Union {
	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	// Simple program to exercise flexible generic method
	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(1);
		integers.add(3);
		integers.add(5);

		Set<Double> doubles = new HashSet<Double>();
		doubles.add(2.0);
		doubles.add(4.0);
		doubles.add(6.0);

		// Won't compile; see page 137
		// Set<Number> numbers = union(integers, doubles);

		// Explicit type parameter is necessary here
		Set<Number> numbers = Union.<Number>union(integers, doubles);

		System.out.println(numbers);
	}
}
