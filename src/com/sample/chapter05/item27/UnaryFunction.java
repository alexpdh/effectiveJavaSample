/**
 * @Project Name:effectiveJavaSample
 * @File Name:UnaryFunction.java
 * @Package Name:com.sample.chapter05.item27
 * @Date:2017年1月12日下午11:01:08
 *
*/

package com.sample.chapter05.item27;
/**
 * @ClassName:UnaryFunction
 * @Function:  Unary function
 * @version
 *
 * @author pengdh
 * @date: 2017年1月12日 下午11:01:08
 */
public interface UnaryFunction<T> {
	T apply(T arg);

}

