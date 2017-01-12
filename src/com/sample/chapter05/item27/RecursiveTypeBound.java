/**
 * @Project Name:effectiveJavaSample
 * @File Name:RecursiveTypeBound.java
 * @Package Name:com.sample.chapter05.item27
 * @Date:2017年1月12日下午11:15:47
 *
*/

package com.sample.chapter05.item27;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName:RecursiveTypeBound
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年1月12日 下午11:15:47
 */
public class RecursiveTypeBound {
	// Returns the maximum value in a list - uses recursive type bound
	public static <T extends Comparable<T>> T max(List<T> list) {
		Iterator<T> i = list.iterator();
		T result = i.next();
		while(i.hasNext()){
			T t = i.next();
			if(t.compareTo(result) > 0) {
				result = t;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> argList = Arrays.asList("ab", "bc");
		System.out.println(max(argList));
	}
}

