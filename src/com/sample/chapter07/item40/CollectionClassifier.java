/**
 * @Project Name:effectiveJavaSample
 * @File Name:CollectionClassifier.java
 * @Package Name:com.sample.chapter07.item40
 * @Date:2017年2月16日下午10:39:51
 *
*/

package com.sample.chapter07.item40;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName:CollectionClassifier
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月16日 下午10:39:51
 */
// Broiken! - What does this program print?
public class CollectionClassifier {
//	public static String classify(Set<?> s) {
//		return "Set";
//	}
//	
//	public static String classify(List<?> lst) {
//		return "List";
//	}
//	
//	public static String classify(Collection<?> c) {
//		return "Unknow Collection";
//	}
	
	public static String classify(Collection<?> c) {
		return c instanceof Set ? "Set" : c instanceof List ? "List" : "Unknown Collection";
	}
	
	public static void main(String[] args) {
		Collection<?> [] collections = {
			new HashSet<String>(),
			new ArrayList<String>(),
			new HashMap<String, String>().values()
		};
		
		for(Collection<?> c :collections)
			System.out.println(classify(c));
	}
}

