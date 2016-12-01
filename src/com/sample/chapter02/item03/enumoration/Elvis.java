/**
 * Project Name:effectiveJavaSample
 * File Name:Elvis.java
 * Package Name:com.sample.chapter02.item03.enumoration
 * Date:2016年12月1日下午11:25:07
 *
*/

package com.sample.chapter02.item03.enumoration;
/**
 * ClassName:Elvis
 * Function: Enum singleton - the preferred approach
 * 枚举类 首选的方法
 * Date:     2016年12月1日 下午11:25:07
 * @author   Administrator
 * @version
 * @since    JDK 1.8
 */
public enum Elvis {
	INSTANCE;
	
	public void leaveTheBuilding() {
		System.out.println("Enum singleton - the preferred approach");
	}
	
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}

