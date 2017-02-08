/**
 * @Project Name:effectiveJavaSample
 * @File Name:Sample2.java
 * @Package Name:com.sample.chapter06.item35
 * @Date:2017年2月8日下午11:49:17
 *
*/

package com.sample.chapter06.item35;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:Sample2
 * @Function: Program containing annotations with a parameter
 * @version
 *
 * @author pengdh
 * @date: 2017年2月8日 下午11:49:17
 */
public class Sample2 {
	@ExceptionTest(ArithmeticException.class)
	public static void m1() { // Test should pass
		int i = 0;
		i = i / i;
	}

	@SuppressWarnings("unused")
	@ExceptionTest(ArithmeticException.class)
	public static void m2() { // Should fail (wrong exception)
		int[] a = new int[0];
		int i = a[1];
	}

	@ExceptionTest(ArithmeticException.class)
	public static void m3() {
	} // Should fail (no exception)

	// Code containing an annotation with an array parameter - Page 174
	@ExceptionTest({ IndexOutOfBoundsException.class,
			NullPointerException.class })
	public static void doublyBad() {
		List<String> list = new ArrayList<String>();

		// The spec permits this method to throw either
		// IndexOutOfBoundsException or NullPointerException
		list.addAll(5, null);
	}
}

