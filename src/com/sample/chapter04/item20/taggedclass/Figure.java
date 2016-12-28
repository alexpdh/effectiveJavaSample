/**
 * @Project Name:effectiveJavaSample
 * @File Name:Figure.java
 * @Package Name:com.sample.chapter04.item20.taggedclass
 * @Date:2016年12月28日下午9:59:45
 *
*/

package com.sample.chapter04.item20.taggedclass;
/**
 * @ClassName:Figure
 * @Function: Tagged class - vastly inferior to a class hierarchy
 * 大大逊色于一个类层次结构 
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 下午9:59:45
 */
class Figure {
	enum Shape {RECTANGLE, CIRCLE};
	
	//Tag field - the shape of this figure
	final Shape shape;
	
	//These fields are used only if shape is RECTANGLE
	double length;
	double width;
	
	//These fields are used only if shape is CIRCLE
	double radius;
	
	//Constructor for circle
	Figure(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}
	
	//Constructor for rectangle
	Figure(double length, double width) {
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}
	
	double area() {
		switch(shape) {
		case RECTANGLE:
			return length * width;
		case CIRCLE:
			return Math.PI * (radius * radius);
		default:
			throw new AssertionError();
		}
	}
}

