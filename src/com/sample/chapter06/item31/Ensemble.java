/**
 * @Project Name:effectiveJavaSample
 * @File Name:Ensemble.java
 * @Package Name:com.sample.chapter06.item31
 * @Date:2017年1月22日下午9:47:29
 *
*/

package com.sample.chapter06.item31;
/**
 * @ClassName:Ensemble
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年1月22日 下午9:47:29
 */
public enum Ensemble {
	SOLO(1),
	DUET(2),
	TRIO(3),
	QUARTET(4),
	QUINTET(5),
	SEXTET(6),
	SEPTET(7),
	OCTET(8),
	DOUBLE_QUARTET(8),
	NONET(8),
	DECTET(10),
	TRIPLE_QUARTET(12);
	
	private final int numberOfMusicians;
	Ensemble(int size) {
		this.numberOfMusicians = size;
	}
	public int numberOfMusicians() {
		return numberOfMusicians;
	}
}

