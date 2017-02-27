/**
 * @Project Name:effectiveJavaSample
 * @File Name:SetExample.java
 * @Package Name:com.sample.chapter07.item53
 * @Date:2017年2月27日下午9:43:36
 *
*/

package com.sample.chapter07.item53;

import java.util.Arrays;
import java.util.Set;

/**
 * @ClassName:SetExample
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月27日 下午9:43:36
 */
public class SetExample {
	// Reflective instantiation with interface access
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Translate the class name into a Class Object
		Class<?> cl = null;
		try {
			cl = Class.forName(args[0]);
		} catch(ClassNotFoundException e) {
			System.err.println("Class not fount.");
			System.exit(1);
		}
		
		// Instantiate the class
		Set<String> s = null;
		try {
			s = (Set<String>) cl.newInstance();
		} catch(IllegalAccessException e) {
			System.err.println("Class not accessible.");
			System.exit(1);
		} catch(InstantiationException e) {
			System.err.println("Class not instantiable.");
			System.exit(1);
		}
		
		// Exercise the set
		s.addAll(Arrays.asList(args).subList(1, args.length));
		System.out.println(s);
	}
}

