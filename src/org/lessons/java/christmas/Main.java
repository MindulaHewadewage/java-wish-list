package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner in= new Scanner(System.in);
		List<String>wishList=new ArrayList<>();
		
		while(true) {
			System.out.println("1 - Desiderio");
			System.out.println("2 - Stampa Lista Desideri");
			
			int userChoice = in.nextInt();
			if(userChoice<1 || userChoice>2) {
				System.out.println("Valori non validi");
				continue;
			}
			if (userChoice == 2 ) break;
			in.nextLine();
			System.out.println("Desiderio:");
			String wish=in.nextLine();
			
			wishList.add(wish);
			
		}
		System.out.println("Desideri:");
		System.out.println(wishList);
		
		

	}

}
