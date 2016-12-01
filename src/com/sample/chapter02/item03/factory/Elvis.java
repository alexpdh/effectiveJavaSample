/**
 * Project Name:effectiveJavaSample
 * File Name:Elvis.java
 * Package Name:com.sample.chapter02.item03.factory
 * Date:2016年12月1日下午11:13:59
 *
*/

package com.sample.chapter02.item03.factory;
/**
 * ClassName:Elvis
 * Function: Singleton with static factory
 * Reason:	 TODO ADD REASON.
 * Date:     2016年12月1日 下午11:13:59
 * @author   Administrator
 * @version
 * @since    JDK 1.8
 */
public class Elvis {
	private static final Elvis INSTANCE = new Elvis();
	//Private constructor
	private Elvis(){
		
	}
	
	public static Elvis getInstance(){
		return INSTANCE;
	}
	
	public void leaveTheBuilding(){
		System.out.println("Singleton with static factory");
	}
	//This code would normally appear outside the class
	//此代码通常会出现在类的外部
	public static void main(String[] args) {
		Elvis elvis = Elvis.getInstance();
		elvis.leaveTheBuilding();
	}
}

