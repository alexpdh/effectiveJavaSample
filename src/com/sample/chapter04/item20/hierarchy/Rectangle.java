/**
 * @Project Name:effectiveJavaSample
 * @File Name:Rectangle.java
 * @Package Name:com.sample.chapter04.item20.hierarchy
 * @Date:2016年12月28日下午10:22:34
 *
*/

package com.sample.chapter04.item20.hierarchy;
/**
 * @ClassName:Rectangle
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 下午10:22:34
 */
class Rectangle extends Figure {
	final double length;
	final double width;
	
	Rectangle (double length, double width) {
		this.length = length;
		this.width =  width;
	}
	@Override
	double area() {
		return length * width;
	}

}

