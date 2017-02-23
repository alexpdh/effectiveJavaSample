/**
 * @Project Name:effectiveJavaSample
 * @File Name:DiceRolls.java
 * @Package Name:com.sample.chapter07.item46
 * @Date:2017年2月23日下午10:51:45
 *
*/

package com.sample.chapter07.item46;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName:DiceRolls
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月23日 下午10:51:45
 */
enum Face {
	ONE, TWO, THREE, FOUR, FIVE, SIX
}
// Same bug as NestIteration.java (but different symptom)!!
public class DiceRolls {
	public static void main(String[] args) {
		Collection<Face> faces = Arrays.asList(Face.values());

		for (Iterator<Face> i = faces.iterator(); i.hasNext();)
			for (Iterator<Face> j = faces.iterator(); j.hasNext();)
				System.out.println(i.next() + " " + j.next());

		// Preferred idiom for nested iteration on collections and arrays
		// for (Face face1 : faces)
		// for (Face face2 : faces)
		// System.out.println(face1 + " " + face2);
	}
}

