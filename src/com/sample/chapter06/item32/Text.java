/**
 * @Project Name:effectiveJavaSample
 * @File Name:Text.java
 * @Package Name:com.sample.chapter06.item32
 * @Date:2017年1月23日下午11:29:05
 *
*/

package com.sample.chapter06.item32;

import java.util.EnumSet;
import java.util.Set;

/**
 * @ClassName:Text
 * @Function:  EnumSet - a modern replacement for bit fields
 * @version
 *
 * @author pengdh
 * @date: 2017年1月23日 下午11:29:05
 */
public class Text {
	public enum Style{BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}
	
	// Any Set could be passed in, but EnumSet is clearly best
	public void applyStyles(Set<Style> styles) {
		
	}
	
	public static void main(String[] args) {
		Text text = new Text();
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	}
}

