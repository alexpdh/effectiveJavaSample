/**
 * @Project Name:effectiveJavaSample
 * @File Name:Elvis.java
 * @Package Name:com.sample.chapter11.item77.enumSingleton
 * @Date:2017年3月15日下午10:24:16
 *
*/

package com.sample.chapter11.item77.enumSingleton;

import java.util.Arrays;

/**
 * @ClassName:Elvis
 * @Function: Enum singleton - the preferred approach 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月15日 下午10:24:16
 */
public enum Elvis {
	INSTANCE;
	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
}

