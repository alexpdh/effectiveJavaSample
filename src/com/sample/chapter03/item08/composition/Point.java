/**
 * Project Name:effectiveJavaSample
 * File Name:Point.java
 * Package Name:com.sample.chapter03.item08.composition
 * Date:2016年12月5日下午10:44:16
 *
*/
package com.sample.chapter03.item08.composition;
/**
 * 
 * ClassName: Point
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性 2：对称性 3：传递性 4：一致性 ClassName:Point Function: 传递性
 * date: 2016年12月6日 上午12:55:28
 *
 * @author Administrator
 * @version
 */
//Simple immutable two-dimensional integer point class
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}

	// See Item 9
	@Override
	public int hashCode() {
		return 31 * x + y;
	}
}
