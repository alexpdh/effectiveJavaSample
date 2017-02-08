/**
 * @Project Name:effectiveJavaSample
 * @File Name:ExceptionTest.java
 * @Package Name:com.sample.chapter06.item35
 * @Date:2017年2月8日下午11:39:11
 *
*/

package com.sample.chapter06.item35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName:ExceptionTest
 * @Function: Annotation type with a paramenter 
 * @version
 *
 * @author pengdh
 * @date: 2017年2月8日 下午11:39:11
 * 
 * Indicates that the annotated method is a test method that	表示注释方法是一种测试方法
 * must throw the designated exception to succeed	必须抛出指定异常才能成功
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
	Class<? extends Exception>[] value();
}

