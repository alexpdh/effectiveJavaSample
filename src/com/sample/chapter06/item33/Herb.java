/**
 * @Project Name:effectiveJavaSample
 * @File Name:Herb.java
 * @Package Name:com.sample.chapter06.item33
 * @Date:2017年2月6日下午9:59:42
 *
*/

package com.sample.chapter06.item33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName:Herb
 * @Function:  Simplistic class representing a culinary herb
 * @version
 *
 * @author pengdh
 * @date: 2017年2月6日 下午9:59:42
 */
public class Herb {
	public enum Type {ANNUAL, PERENNIAL, BIENNIAL}
	
	private final String name;
	private final Type type;
	
	Herb(String name, Type type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Herb[] garden = { new Herb("Basil", Type.ANNUAL),
				new Herb("Carroway", Type.BIENNIAL),
				new Herb("Dill", Type.ANNUAL),
				new Herb("Lavendar", Type.PERENNIAL),
				new Herb("Parsley", Type.BIENNIAL),
				new Herb("Rosemary", Type.PERENNIAL) };

		// Using an EnumMap to associate data with an enum - Page 162
		Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Herb.Type, Set<Herb>>(
				Herb.Type.class);
		for (Herb.Type t : Herb.Type.values())
			herbsByType.put(t, new HashSet<Herb>());
		for (Herb h : garden)
			herbsByType.get(h.type).add(h);
		System.out.println(herbsByType);
	}
}

