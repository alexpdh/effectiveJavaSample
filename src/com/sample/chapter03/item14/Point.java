/**
 * Project Name:effectiveJavaSample
 * File Name:Point.java
 * Package Name:com.sample.chapter03.item14
 * Date:2016年12月13日下午11:31:09
 *
*/

package com.sample.chapter03.item14;
/**
 * ClassName:Point
 * Function: TODO ADD FUNCTION.
 * Date:     2016年12月13日 下午11:31:09
 *
 * @author   Administrator
 * @version
 */
//Encapsulation of data by accessor methods and mutators
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}

