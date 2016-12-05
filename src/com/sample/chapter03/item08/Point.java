/**
 * Project Name:effectiveJavaSample
 * File Name:Point.java
 * Package Name:com.sample.chapter03.item08
 * Date:2016年12月5日下午10:44:16
 *
*/

package com.sample.chapter03.item08;

/**
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性 2：对称性 3：传递性 4：一致性 ClassName:Point Function: 传递性 
 * Date: 2016年12月5日 下午10:44:16
 *
 * @author Administrator
 * @version
 */
// Simple immutable two-dimensional integer point class
// 简单的不可变的二维整数点类
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	public boolean equals(Object o) {
//		if (!(o instanceof Point))
//			return false;
//		Point p = (Point) o;
//		return p.x == x && p.y == y;
//	}

	// Broken - violates Liskov substitution principle - Pages 39-40
	 @Override 
	 public boolean equals(Object o) {
	 if (o == null || o.getClass() != getClass())
	 return false;
	 Point p = (Point) o;
	 return p.x == x && p.y == y;
	 }

	public int hashcode() {
		return 31 * x + y;
	}
}
