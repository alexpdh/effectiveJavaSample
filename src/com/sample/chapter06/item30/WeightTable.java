/**
 * @Project Name:effectiveJavaSample
 * @File Name:WeightTable.java
 * @Package Name:com.sample.chapter06.item30
 * @Date:2017年1月19日下午11:05:21
 *
*/

package com.sample.chapter06.item30;
/**
 * @ClassName:WeightTable
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年1月19日 下午11:05:21
 */
public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble("3");
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
}

