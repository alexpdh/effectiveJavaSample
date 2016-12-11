/**
 * Project Name:effectiveJavaSample
 * File Name:WordList.java
 * Package Name:com.sample.chapter03.item12
 * Date:2016年12月12日上午12:38:49
 *
*/

package com.sample.chapter03.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName:WordList
 * Function: TODO ADD FUNCTION.
 * Date:     2016年12月12日 上午12:38:49
 *
 * @author   Administrator
 * @version
 */
public class WordList {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		Collections.addAll(s, args);
		System.out.println(s);
	}
}

