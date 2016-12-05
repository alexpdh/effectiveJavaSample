/**
 * Project Name:effectiveJavaSample
 * File Name:CaseInsensitiveString.java
 * Package Name:com.sample.chapter03.item08
 * Date:2016年12月5日下午9:18:57
 *
*/

package com.sample.chapter03.item08;

/**
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性	2：对称性	3：传递性	4：一致性
 * ClassName:CaseInsensitiveString 
 * Function: 	对称性
 * Date: 2016年12月5日 下午9:18:57
 * 
 * @author Administrator
 * @version
 */
//Broken - violates symmetry 违反对称性.
public class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	// Broken - violates symmetry
	@Override
	public boolean equals(Object o) {
		if (o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		// One-way interoperability
		// 单方面的互操作性
		if (o instanceof String)
			return s.equalsIgnoreCase((String) o);
		return false;
	}

	// This version is correct.
//	@Override
//	public boolean equals(Object o) {
//		return o instanceof CaseInsensitiveString && 
//	    	((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
//	}

	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String s = "polish";
		System.out.println(cis.equals(s) + "  " + s.equals(cis));
	}
}
