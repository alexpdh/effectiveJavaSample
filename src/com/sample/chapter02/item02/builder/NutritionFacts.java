/**
 * Project Name:effectiveJavaSample
 * File Name:NutritionFacts.java
 * Package Name:com.sample.chapter02.item02.builder
 * Date:2016年11月29日下午11:29:33
 *
*/

package com.sample.chapter02.item02.builder;
/**
 * ClassName:NutritionFacts
 * Function: TODO Builder Pattern
 * Reason:	 TODO ADD REASON.
 * Date:     2016年11月29日 下午11:29:33
 * @author   Administrator
 * @version
 * @since    JDK 1.8
 */
public class NutritionFacts {
	 private final int servingSize;		//(ml)				required
	 private final int servings;		//(per container)	required
	 private final int calories;		//					optional
	 private final int fat;				//(g)				optional
	 private final int sodium;			//(mg)				optional
	 private final int carbohydrate;	//(g)				optional
	 
	 public static class Builder{
		 //Required parameters
		 private final int servingSize;		
		 private final int servings;
		 
		 //Optional parameters - initialized to default values
		 private int calories;
		 private int fat;
		 private int sodium;
		 private int carbohydrate;
		 
		 public Builder(int servingSize, int servings){
			 this.servingSize = servingSize;
			 this.servings = servings;
		 }
		 
		 public Builder calories(int val){
			 calories = val;
			 return this;
		 }
		 
		 public Builder fat(int val){
			 fat = val;
			 return this;
		 }
		 
		 public Builder sodium(int val){
			 sodium = val;
			 return this;
		 }
		 
		 public Builder carbohydrate(int val){
			 carbohydrate = val;
			 return this;
		 }
		 
		 public NutritionFacts build(){
			 return new NutritionFacts(this);
		 }
		 
	 }
	 public NutritionFacts(Builder builder) {
			
			servingSize = builder.servingSize;
			servings = builder.servings;
			calories = builder.calories;
			fat = builder.fat;
			sodium = builder.sodium;
			carbohydrate = builder.carbohydrate;
			
		}
	 NutritionFacts cocaCola = new NutritionFacts.Builder(1, 2).
			 calories(3).fat(4).sodium(5).carbohydrate(6).build();
}

