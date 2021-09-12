package com.example.lab1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.example.lab1.Fruit.FruitComparator;
import com.example.lab1.Fruit.FruitComparatorDesc;


public class Main {

	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1=new Fruit(101,"Apple",1000);
		fl.add(s1);//adding Fruit class object
		Fruit s2=new Fruit(102,"Orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi",2000));
		
		fl.add(new Fruit(104,"Banana",2000));
		fl.add(new Fruit(105,"Grape",2000));
		fl.add(new Fruit(106,"Watermelon",2000));
		fl.add(new Fruit(107,"Lemon",2000));
		fl.add(new Fruit(108,"Strawberry",2000));
		fl.add(new Fruit(109,"Blueberry",2000));
		fl.add(new Fruit(110,"Raspberry",2000));
		
		Collections.sort(fl,new FruitComparator());
		
		//Traverse elements of arraylist (ordered)
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		//Traverse elements of arraylist (reverse ordered)
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
