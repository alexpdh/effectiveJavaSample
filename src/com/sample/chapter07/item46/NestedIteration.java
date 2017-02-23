/**
 * @Project Name:effectiveJavaSample
 * @File Name:NestedIteration.java
 * @Package Name:com.sample.chapter07.item46
 * @Date:2017年2月23日下午10:30:47
 *
*/

package com.sample.chapter07.item46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName:NestedIteration
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月23日 下午10:30:47
 */
enum Suit {CLUB, DIAMOND, HEART, SPADE }
enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

class Card {
	final Suit suit;
	final Rank rank;
	
	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
}
//Can you spot the bug
public class NestedIteration {
	public static void main(String[] args) {
		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());
		
		List<Card> deck = new ArrayList<Card>();
		for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();){
				deck.add(new Card(i.next(), j.next()));
			}
		}
		// Preferred idiom for nested iteration on collections and arrays
//		for(Suit suit : suits) {
//			for(Rank rank : ranks) {
//				deck.add(new Card(suit, rank));
//			}
//		}
	}
}

