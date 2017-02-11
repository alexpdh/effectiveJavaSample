/**
 * @Project Name:effectiveJavaSample
 * @File Name:Bigram.java
 * @Package Name:com.sample.chapter06.item36
 * @Date:2017年2月11日下午11:49:23
 *
*/

package com.sample.chapter06.item36;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:Bigram
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月11日 下午11:49:23
 */
public class Bigram {
	private final char first;
	private final char second;
	public Bigram(char first, char second) {
		this.first = first;
		this.second =  second;
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Bigram))
			return false;
			Bigram b = (Bigram)o;
			return b.first == first && b.second == second;
	}
	public int hashCode() {
		return 31 * first + second;
	}
	
	public static void main(String[] args) {
		Set<Bigram> s = new HashSet<Bigram>();
		for(int i = 0; i < 10; i++) {
			for(char ch = 'a' ; ch <= 'z'; ch++) {
				s.add(new Bigram(ch,ch));
			}
		}
		System.out.println(s.size());
	}
}

