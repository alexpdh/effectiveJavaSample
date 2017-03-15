/**
 * @Project Name:effectiveJavaSample
 * @File Name:MutablePeriod.java
 * @Package Name:com.sample.chapter11.item78
 * @Date:2017年3月15日下午10:32:14
 *
*/

package com.sample.chapter11.item78;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @ClassName:MutablePeriod
 * @Function: Mutable period attack 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月15日 下午10:32:14
 */
public class MutablePeriod {
	// A period instance
		public final Period period;

		// period's start field, to which we shouldn't have access
		public final Date start;

		// period's end field, to which we shouldn't have access
		public final Date end;

		public MutablePeriod() {
			try {
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutputStream out = new ObjectOutputStream(bos);

				// Serialize a valid Period instance
				out.writeObject(new Period(new Date(), new Date()));

				/*
				 * Append rogue "previous object refs" for internal Date fields in
				 * Period. For details, see "Java Object Serialization
				 * Specification," Section 6.4.
				 */
				byte[] ref = { 0x71, 0, 0x7e, 0, 5 }; // Ref #5
				bos.write(ref); // The start field
				ref[4] = 4; // Ref # 4
				bos.write(ref); // The end field

				// Deserialize Period and "stolen" Date references
				ObjectInputStream in = new ObjectInputStream(
						new ByteArrayInputStream(bos.toByteArray()));
				period = (Period) in.readObject();
				start = (Date) in.readObject();
				end = (Date) in.readObject();
			} catch (Exception e) {
				throw new AssertionError(e);
			}
		}

		public static void main(String[] args) {
			MutablePeriod mp = new MutablePeriod();
			Period p = mp.period;
			Date pEnd = mp.end;

			// Let's turn back the clock
			pEnd.setYear(78);
			System.out.println(p);

			// Bring back the 60s!
			pEnd.setYear(69);
			System.out.println(p);
		}
	}

