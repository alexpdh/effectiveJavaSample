/**
 * Project Name:effectiveJavaSample
 * File Name:Elvis.java
 * Package Name:com.sample.chapter02.item03.serializable
 * Date:2016年12月1日下午11:20:11
 *
*/

package com.sample.chapter02.item03.serializable;

/**
 * ClassName:Elvis 
 * Function: Serializable singleton with public final field
 * Reason: TODO ADD REASON.
 * Date: 2016年12月1日 下午11:20:11
 * @author Administrator
 * @version
 * @since JDK 1.8
 */
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	public void leaveTheBuilding() {
		System.out.println("Serializable singleton with public final field");
	}

	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return INSTANCE;
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
