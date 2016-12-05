/**
 * Project Name:effectiveJavaSample
 * File Name:ColorPoint.java
 * Package Name:com.sample.chapter03.item08
 * Date:2016年12月5日下午10:59:52
 *
*/

package com.sample.chapter03.item08;

/**
 * ClassName:ColorPoint
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性 2：对称性 3：传递性 4：一致性 ClassName:Point Function: 传递性 
 * Date: 2016年12月5日 下午10:59:52
 *
 * @author Administrator
 * @version
 */
public class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	// Broken - violates symmetry
	// public boolean equals(Object o) {
	// if(!(o instanceof ColorPoint))
	// return false;
	// return super.equals(o) && ((ColorPoint) o).color == color;
	// }

	// Broken - violates symmetry
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;

		// If o is a normal Point, do a color-blind comparison
		if (!(o instanceof ColorPoint))
			return o.equals(this);

		// o is a ColorPoint; do a full comparison
		return super.equals(o) && ((ColorPoint) o).color == color;
	}

	public static void main(String[] args) {
		// First equals function violates symmetry
		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);
		System.out.println(p.equals(cp) + " " + cp.equals(p));

		// Second equals function violates transitivity
		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
		System.out.printf("%s %s %s%n", p1.equals(p2), p2.equals(p3), p1.equals(p3));
	}

}
