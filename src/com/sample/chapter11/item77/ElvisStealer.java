/**
 * @Project Name:effectiveJavaSample
 * @File Name:ElvisStealer.java
 * @Package Name:com.sample.chapter11.item77
 * @Date:2017年3月15日下午10:20:17
 *
*/

package com.sample.chapter11.item77;

import java.io.Serializable;

/**
 * @ClassName:ElvisStealer
 * @Function: "Stealer" class 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月15日 下午10:20:17
 */
public class ElvisStealer implements Serializable {
	static Elvis impersonator;
	private Elvis payload;

	private Object readResolve() {
		// Save a reference to the "unresolved" Elvis instance
		impersonator = payload;

		// Return an object of correct type for favorites field
		return new String[] { "A Fool Such as I" };
	}

	private static final long serialVersionUID = 0;
}
