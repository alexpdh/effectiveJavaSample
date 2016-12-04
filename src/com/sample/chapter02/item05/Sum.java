/**
 * Project Name:effectiveJavaSample
 * File Name:Sum.java
 * Package Name:com.sample.chapter02.item05
 * Date:2016年12月4日下午9:01:07
 *
*/

package com.sample.chapter02.item05;
/**
 * ClassName:Sum
 * Function: TODO ADD Hideously slow program! Can you spot the object creation?
 * 非常缓慢的程序！你能发现物体的创建吗？
 * 变量sum被申明成Long而不是long
 * Date:     2016年12月4日 下午9:01:07
 * @author   Administrator
 * @version
 */
public class Sum {
	public static void main(String[] args){
		Long sum = 0L;
		for(long i = 0L; i<Integer.MAX_VALUE; i++){
			sum += i;
		}
		System.out.println(sum);
	}
}

