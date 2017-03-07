/**
 * @Project Name:effectiveJavaSample
 * @File Name:Intern.java
 * @Package Name:com.sample.chapter10.item69
 * @Date:2017年3月7日下午11:07:25
 *
*/

package com.sample.chapter10.item69;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @ClassName:Intern
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月7日 下午11:07:25
 */
public class Intern {
	private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
	// Concurrent canonicalizing map atop ConcurrentMap - not optimal
		// public static String intern(String s) {
		// String previousValue = map.putIfAbsent(s, s);
		// return previousValue == null ? s : previousValue;
		// }
	// Concurrent canonicalizing map atop Concurrent - faster!
	public static String intern(String s) {
		String result = map.get(s);
		if (result == null) {
			result = map.putIfAbsent(s, s);
			if (result == null) {
				result = s;
			}
		}
		return result;
	}
}

