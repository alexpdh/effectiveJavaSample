/**
 * @Project Name:effectiveJavaSample
 * @File Name:Sample.java
 * @Package Name:com.sample.chapter06.item35
 * @Date:2017年2月8日下午11:05:01
 *
*/

package com.sample.chapter06.item35;
/**
 * @ClassName:Sample
 * @Function: Program containing marker annotations
 * 包含标记注释的程序 
 * @version
 *
 * @author pengdh
 * @date: 2017年2月8日 下午11:05:01
 */
public class Sample {
	@Test
	public static void m1() {}	// Test should pass
	public static void m2() {}
	@Test
	public static void m3() {	// Test should fail
		throw new RuntimeException("Boom");
	}
	public static void m4() {}
	// INVALID USE: nonstatic mehtod
	// 是一个普通实例方法，不是有效的注解方法（无参静态方法）
	@Test
	public void m5() {}	
	public static void m6() {}
	@Test
	public static void m7() {
		throw new RuntimeException("Crash");
	}
	public static void m8() {}
}

