/**
 * Project Name:effectiveJavaSample
 * File Name:Elvis.java
 * Package Name:com.sample.chapter02.item03.field
 * Date:2016年12月1日下午11:06:37
 *
*/

package com.sample.chapter02.item03.field;
/**
 * ClassName:Elvis
 * Function: TODO Singleton with public final field
 * Reason:	 TODO 具有公共最终字段的单例
 * Date:     2016年12月1日 下午11:06:37
 * @author   Administrator
 * @version
 * @since    JDK 1.8
 */
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();
	//Private constructor
	private Elvis(){
		
	}
	public void leaveTheBuilding(){
		System.out.println("Singleton with public final field");
	}
	//This code would normally appear outside the class
	//此代码通常会出现在类的外部
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}

