/**
 * @Project Name:effectiveJavaSample
 * @File Name:Super.java
 * @Package Name:com.sample.chapter03.item17
 * @Date:2016年12月26日下午10:52:53
 *
*/

package com.sample.chapter04.item17;
/**
 * @ClassName:Super
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2016年12月26日 下午10:52:53
 */
public class Super {
	//Broken - constructor invokes an overridable method
	public Super() {
		overrideMe();
	}

	public void overrideMe() {
		
	}
}

