/**
 * @Project Name:effectiveJavaSample
 * @File Name:PrintAnnotation.java
 * @Package Name:com.sample.chapter05.item29
 * @Date:2017年1月16日下午11:59:44
 *
*/

package com.sample.chapter05.item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * @ClassName:PrintAnnotation
 * @Function:  Use of asSubclass to safely cast to a bounded type token
 * 使用assubclass安全投到一个有界型令牌
 * @version
 *
 * @author pengdh
 * @date: 2017年1月16日 下午11:59:44
 */
public class PrintAnnotation {
	static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
		Class<?> annotationType = null; //Unbounded token
		try {
			annotationType = Class.forName(annotationTypeName);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
		return element.getAnnotation(annotationType.asSubclass(Annotation.class));
	}
	
	// Test program to print named annotation of named class
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out
					.println("Usage: java PrintAnnotation <class> <annotation>");
			System.exit(1);
		}
		String className = args[0];
		String annotationTypeName = args[1];
		Class<?> klass = Class.forName(className);
		System.out.println(getAnnotation(klass, annotationTypeName));
	}
}

