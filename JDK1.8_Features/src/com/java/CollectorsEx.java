package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item
{
	int id;
	String iName;
	int cost;
	
	public Item(int id, String iName, int cost) {
		super();
		this.id = id;
		this.iName = iName;
		this.cost = cost;
	}

}

public class CollectorsEx {
	
	public static void main(String[] args) {
		
		List<Item> l= new ArrayList<Item>();
		l.add(new Item(1,"Pen",45));
		l.add(new Item(2,"Marker",29));
		l.add(new Item(3,"Laptop",73));
		l.add(new Item(4,"Desktop",26));
		
		int iSum = l.stream().collect(Collectors.summingInt(c->c.cost));
		System.out.println("Sum of Items: "+iSum);
		Integer idSum = l.stream().collect(Collectors.summingInt(d->d.id));
		System.out.println("ID sum: "+idSum);
		Double avCost= l.stream().collect(Collectors.averagingDouble(a->a.cost));
		System.out.println("Average Cost: "+avCost);
		Long citem = l.stream().collect(Collectors.counting());
		System.out.println("Total no of Items: "+citem);
	}

}
