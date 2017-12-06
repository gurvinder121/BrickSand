package com.stone;

import java.util.ArrayList;

public class ArrayList10 {
	
	
	
	
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(65);
		list.add(98);
		list.add(52);
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
	}

}
