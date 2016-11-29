/**
 * Project Name:effectiveJavaSample
 * File Name:NutritionFacts.java
 * Package Name:com.sample.chapter02.item02
 * Date:2016年11月29日下午10:35:19
 *
*/

package com.sample.chapter02.item02.telescopingconstructor;
/**
 * 
 * ClassName: NutritionFacts
 * Function: telescoping constructor pattern - does not scale well
 * 可伸缩的构造函数模式-不能很好的扩展
 * date: 2016年11月29日 下午10:38:53
 *
 * @author Administrator
 * @version 
 * @since JDK 1.8
 */
public class NutritionFacts {
	 private final int servingSize;		//(ml)				required
	 private final int servings;		//(per container)	required
	 private final int calories;		//					optional
	 private final int fat;				//(g)				optional
	 private final int sodium;			//(mg)				optional
	 private final int carbohydrate;	//(g)				optional
	 
	 public NutritionFacts(int servingSize, int servings){
		 this(servingSize, servings, 0);
	 }

	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	NutritionFacts cocaCola = new NutritionFacts(1, 2, 3, 4, 5, 6);
}

