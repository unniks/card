package inferdata.solutions.linkedlist;

/*
 * Copyright (c) 2003 InferData Corporation. All Rights Reserved.
 *  
 */

public class Card {
	public Card(int value, String suit) {
		myValue = value;
		mySuit = suit;
	}

	public int getValue() {
		return myValue;
	}

	public String getSuit() {
		return mySuit;
	}

	public void print() {
		System.out.println(myValue + " of " + mySuit);
	}

	private String mySuit;

	private int myValue;
}
