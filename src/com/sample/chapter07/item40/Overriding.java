/**
 * @Project Name:effectiveJavaSample
 * @File Name:Wine.java
 * @Package Name:com.sample.chapter07.item40
 * @Date:2017年2月16日下午10:56:25
 *
*/

package com.sample.chapter07.item40;
/**
 * @ClassName:Wine
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月16日 下午10:56:25
 */
class Wine {
	String name() {
		return "wine";
	}
}

class SparklingWine extends Wine {
	@Override
	String name() {
		return "sparklingWine";
	}
}

class Champagne extends SparklingWine {
	@Override
	String name() {
		return "champagne";
	}
}

public class Overriding {
	public static void main(String[] args) {
		Wine[] wines = {
			new Wine(),
			new SparklingWine(),
			new Champagne()
		};
		for(Wine wine : wines) {
			System.out.println(wine.name());
		}
	}
}