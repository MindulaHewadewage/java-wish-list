package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mainset {

	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		Random rnd = new Random();
		while(mySet.size()<5) {
			int valore = rnd.nextInt(2,13);
			mySet.add(valore);
		}
		
		System.out.println(mySet);

	}

}
