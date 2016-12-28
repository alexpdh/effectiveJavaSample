/**
 * @Project Name:effectiveJavaSample
 * @File Name:Circle.java
 * @Package Name:com.sample.chapter04.item20.taggedclass
 * @Date:2016年12月28日下午10:16:37
 *
*/

package com.sample.chapter04.item20.hierarchy;

/**
 * @ClassName:Circle
 * @Function: 圆形
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 下午10:16:37
 */
class Circle extends Figure {
	final double radius;
	Circle (double radius) {
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * (radius * radius);
	}
}

