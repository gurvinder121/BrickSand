package com.stone;

import java.util.Hashtable;

public class HashTable15 {
	
	public static void main(String args[])
	{
		
	Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
	ht.put(1,"kuldeep");
	ht.put(2,"kul");
	ht.put(3,"sandeep");
	ht.put(89,"kuldeep singh");
	
	System.out.println(ht.get(2));
	System.out.println(ht.get(89));
	

}
}