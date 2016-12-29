/**
 * @Project Name:effectiveJavaSample
 * @File Name:Raw.java
 * @Package Name:com.sample.chapter05.item23
 * @Date:2016年12月29日下午10:41:35
 *
*/

package com.sample.chapter05.item23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName:Raw
 * @Function:
 * @version
 *
 * @author pengdh
 * @date: 2016年12月29日 下午10:41:35
 */
public class Raw {
	// Uses raw type (List) - fails at runtime! - Page 112
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		unsafeAdd(strings, new Integer(42));
		String s = strings.get(0); // Compiler-generated cast
	}

	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}

	// Use of raw type for unknown element type - don't do this! - Page 113
	static int rawNumElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}

	// Unbounded wildcard type - typesafe and flexible - Page 113
	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}
}
