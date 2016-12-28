/**
 * @Project Name:effectiveJavaSample
 * @File Name:Host.java
 * @Package Name:com.sample.chapter04.item21
 * @Date:2016年12月28日下午11:08:57
 *
*/

package com.sample.chapter04.item21;

import java.io.Serializable;

/**
 * @ClassName:Host
 * @Function: Exproting a concrete strategy 
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 下午11:08:57
 */
public class Host {
	private static class StrLenCmp implements Comparator<String>, Serializable {
		/**
		 * serialVersionUID:
		 */
		private static final long serialVersionUID = 3591808125451383003L;

		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
		}
	}
	
	//Returned comparator is serializble
	public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();
}

