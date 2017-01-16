/**
 * @Project Name:effectiveJavaSample
 * @File Name:RecursiveTypeBound.java
 * @Package Name:com.sample.chapter05.item28
 * @Date:2017年1月16日下午11:06:24
 *
*/

package com.sample.chapter05.item28;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName:RecursiveTypeBound
 * @Function: Using a recursive type bound with wildcards
 * @version
 *
 * @author pengdh
 * @date: 2017年1月16日 下午11:06:24
 */
public class RecursiveTypeBound {
	public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
		Iterator<? extends T> i = list.iterator();
		T result = i.next();
		while (i.hasNext()) {
			T t = i.next();
			if (t.compareTo(result) > 0)
				result = t;
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> argList = Arrays.asList(args);
		System.out.println(max(argList));
	}
}
