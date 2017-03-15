/**
 * @Project Name:effectiveJavaSample
 * @File Name:Elvis.java
 * @Package Name:com.sample.chapter11.item77
 * @Date:2017年3月15日下午10:18:42
 *
*/

package com.sample.chapter11.item77;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @ClassName:Elvis
 * @Function: Broken singleton - has nontransient object reference field! 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月15日 下午10:18:42
 */
public class Elvis implements Serializable {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}

	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
}

