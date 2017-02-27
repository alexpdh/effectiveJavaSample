/**
 * @Project Name:effectiveJavaSample
 * @File Name:BrokenComparator.java
 * @Package Name:com.sample.chapter07.item49
 * @Date:2017年2月26日下午9:17:30
 *
*/

package com.sample.chapter07.item49;

import java.util.Comparator;

/**
 * @ClassName:BrokenComparator
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月26日 下午9:17:30
 */
public class BrokenComparator {
	public static void main(String[] args) {
		// Broken comparator - can you spot the flaw
//		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer first, Integer second) {
//				return first < second ? -1 : (first == second ? 0 : 1); 
//			}
//		};
		
		//Fixed comparator
		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				int f = first;	// Auto unboxing
				int s = second;	// Auto unboxing
				return f < s ? -1 : (f == s ? 0 : 1);
			}
			
		};
		
		int result = naturalOrder.compare(new Integer(42), new Integer(42));
		System.out.println(result);
	}
}

