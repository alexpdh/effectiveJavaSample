/**
 * @Project Name:effectiveJavaSample
 * @File Name:Reduction.java
 * @Package Name:com.sample.chapter05.item25
 * @Date:2017年1月11日下午10:00:09
 *
*/

package com.sample.chapter05.item25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:Reduction
 * @Function: Reduction without generics, and with concurrency flaw 减少非泛型，并发性缺陷
 * @version
 *
 * @author pengdh
 * @date: 2017年1月11日 下午10:00:09
 */
public class Reduction {
	static <E> E reduce(List<E> list, Function<E> f, E initVal) {
		List<E> snapshot;
		synchronized (list) {
			snapshot = new ArrayList<E>(list);
		}
		E result = initVal;
		for (E e : snapshot)
			result = f.apply(result, e);
		return result;
	}

	private static final Function<Integer> SUM = new Function<Integer>() {
		public Integer apply(Integer i1, Integer i2) {
			return i1 + i2;
		}
	};
	
	private static final Function<Integer> PRODUCT = new Function<Integer>() {
		public Integer apply(Integer i1, Integer i2) {
			return i1 * i2;
		}
	};
	
	private static final Function<Integer> MAX = new Function<Integer>() {
		public Integer apply(Integer i1, Integer i2) {
			return Math.max(i1, i2);
		}
	};

	private static final Function<Integer> MIN = new Function<Integer>() {
		public Integer apply(Integer i1, Integer i2) {
			return Math.min(i1, i2);
		}
	};
	
	// Reduce intList using each of the above reducers
	public static void main(String[] args) {
		List<Integer> initVal = Arrays.asList(2, 7, 1, 8, 2, 8, 1, 8, 2, 8);
		System.out.println(reduce(initVal, SUM, 0));
		System.out.println(reduce(initVal, PRODUCT, 1));
		System.out.println(reduce(initVal, MAX, Integer.MIN_VALUE));
		System.out.println(reduce(initVal, MIN, Integer.MAX_VALUE));
	}
}
