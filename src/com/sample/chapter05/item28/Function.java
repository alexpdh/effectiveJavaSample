/**
 * @Project Name:effectiveJavaSample
 * @File Name:Function.java
 * @Package Name:com.sample.chapter05.item28
 * @Date:2017年1月16日下午11:05:47
 *
*/

package com.sample.chapter05.item28;
/**
 * @ClassName:Function
 * @Function:  Generic Function interface
 * @version
 *
 * @author pengdh
 * @date: 2017年1月16日 下午11:05:47
 */
interface Function<T> {
	T apply(T arg1, T arg2);
}

