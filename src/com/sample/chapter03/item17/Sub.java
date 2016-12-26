/**
 * @Project Name:effectiveJavaSample
 * @File Name:Sub.java
 * @Package Name:com.sample.chapter03.item17
 * @Date:2016年12月26日下午10:53:55
 *
*/

package com.sample.chapter03.item17;

import java.util.Date;

/**
 * @ClassName:Sub
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2016年12月26日 下午10:53:55
 */
public class Sub extends Super {
	private final Date date; // Blank final, set by constructor
	
	Sub() {
		date = new Date();
	}
	
	//Overriding method invoked by supperclass constructor
	@Override
	public void overrideMe() {
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
	}
}

