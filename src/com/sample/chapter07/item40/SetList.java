/**
 * @Project Name:effectiveJavaSample
 * @File Name:SetList.java
 * @Package Name:com.sample.chapter07.item40
 * @Date:2017年2月16日下午11:13:31
 *
*/

package com.sample.chapter07.item40;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName:SetList
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月16日 下午11:13:31
 */
public class SetList {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}
		for(int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove((Integer)i); // or remove(Integer.valueOf(i))
		}
		System.out.println(set + " " + list);
	}
}

