/**
 * @Project Name:effectiveJavaSample
 * @File Name:RunTests.java
 * @Package Name:com.sample.chapter06.item35
 * @Date:2017年2月8日下午11:21:36
 *
*/

package com.sample.chapter06.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName:RunTests
 * @Function: Program to process marker annotations 处理标记注释的程序
 * @version
 *
 * @author pengdh
 * @date: 2017年2月8日 下午11:21:36
 */
public class RunTests {
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class<?> testClass = Class.forName(Sample2.class.getName());
		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("INVALID @Test: " + m);
				}
				System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
			}

			// Array ExceptionTest processing code
			if (m.isAnnotationPresent(ExceptionTest.class)) {
				tests++;
				try {
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (Throwable wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					Class<? extends Exception>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
					int oldPassed = passed;
					for (Class<? extends Exception> excType : excTypes) {
						if (excType.isInstance(exc)) {
							passed++;
							break;
						}
					}
					if (passed == oldPassed)
						System.out.printf("Test %s failed: %s %n", m, exc);
				}
			}
		}
	}
}
