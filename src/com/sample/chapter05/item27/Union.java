/**
 * @Project Name:effectiveJavaSample
 * @File Name:Union.java
 * @Package Name:com.sample.chapter05.item27
 * @Date:2017年1月12日下午10:43:02
 *
*/

package com.sample.chapter05.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:Union
 * @Function:  Generic union method and program to exercise it
 * @version
 *
 * @author pengdh
 * @date: 2017年1月12日 下午10:43:02
 */
public class Union {
	// Generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}
	// Simple program to exercise generic method
	public static void main(String[] args) {
		Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));
		Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
		Set<String> aflCio = union(guys, stooges);
		System.out.println(aflCio);
	}
}

