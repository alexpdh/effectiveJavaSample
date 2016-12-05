/**
 * Project Name:effectiveJavaSample
 * File Name:ColorPoint.java
 * Package Name:com.sample.chapter03.item08.composition
 * Date:2016年12月6日 上午12:57:38
 *
*/
// Adds a value component without violating the equals contract - Page 40
package com.sample.chapter03.item08.composition;
/**
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性 2：对称性 3：传递性 4：一致性 ClassName:Point Function: 传递性 
 * ClassName: ColorPoint
 * date: 2016年12月6日 上午12:57:38
 *
 * @author Administrator
 * @version
 */
public class ColorPoint {
	private final Point point;
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		if (color == null)
			throw new NullPointerException();
		point = new Point(x, y);
		this.color = color;
	}

	/**
	 * Returns the point-view of this color point.
	 */
	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color.equals(color);
	}

	@Override
	public int hashCode() {
		return point.hashCode() * 33 + color.hashCode();
	}
}