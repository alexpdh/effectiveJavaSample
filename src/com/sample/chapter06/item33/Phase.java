/**
 * @Project Name:effectiveJavaSample
 * @File Name:Phase.java
 * @Package Name:com.sample.chapter06.item33
 * @Date:2017年2月6日下午10:05:40
 *
*/

package com.sample.chapter06.item33;

import java.util.EnumMap;
import java.util.Map;

/**
 * @ClassName:Phase
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月6日 下午10:05:40
 */
public enum Phase {
	SOLID, LIQUID, GAS;

	public enum Transition {
		MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), CONDENSE(
				GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

		private final Phase src;
		private final Phase dst;

		Transition(Phase src, Phase dst) {
			this.src = src;
			this.dst = dst;
		}

		// Initialize the phase transition map
		private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<Phase, Map<Phase, Transition>>(
				Phase.class);
		static {
			for (Phase p : Phase.values())
				m.put(p, new EnumMap<Phase, Transition>(Phase.class));
			for (Transition trans : Transition.values())
				m.get(trans.src).put(trans.dst, trans);
		}

		public static Transition from(Phase src, Phase dst) {
			return m.get(src).get(dst);
		}
	}

	// Simple demo program - prints a sloppy table
	public static void main(String[] args) {
		for (Phase src : Phase.values())
			for (Phase dst : Phase.values())
				if (src != dst)
					System.out.printf("%s to %s : %s %n", src, dst,
							Transition.from(src, dst));
	}
}


