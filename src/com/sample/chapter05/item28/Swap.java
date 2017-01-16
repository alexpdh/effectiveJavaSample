/**
 * @Project Name:effectiveJavaSample
 * @File Name:Swap.java
 * @Package Name:com.sample.chapter05.item28
 * @Date:2017年1月16日下午11:04:27
 *
*/

package com.sample.chapter05.item28;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:Swap
 * @Function: Private helper method for wildcard capture
 * @version
 *
 * @author pengdh
 * @date: 2017年1月16日 下午11:04:27
 */
public class Swap {
	public static void swap(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}

	// Private helper method for wildcard capture
	private static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}

	public static void main(String[] args) {
		// Swap the first and last argument and print the resulting list
		List<String> argList = Arrays.asList(args);
		swap(argList, 0, argList.size() - 1);
		System.out.println(argList);
	}
}
