/**
 * @Project Name:effectiveJavaSample
 * @File Name:ThreadLocal.java
 * @Package Name:com.sample.chapter07.item50
 * @Date:2017年2月26日下午10:05:29
 *
*/

package com.sample.chapter07.item50;
/**
 * @ClassName:ThreadLocal
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月26日 下午10:05:29
 */
// Broken - inapropriate use of string as capbility!
public class ThreadLocalCapability {
	private ThreadLocalCapability() {}	// Noninstantiable
	// Sets the current thred's value for the named variable
//	public static void set(String key, Object value) {
//	}
	
	// Return the current thread's value for the named variable
//	public static Object get(String key) {
//		return key;
//	}
	
	public static class Key {
		Key() {}
	}
	
	// Generates a unique, unforgeable key
	public static Key getKey() {
		return new Key();
	}
	
	public static void set(Key key, Object value) {
	}
	public static Object get(Key key) {
		return key;
	}
}

