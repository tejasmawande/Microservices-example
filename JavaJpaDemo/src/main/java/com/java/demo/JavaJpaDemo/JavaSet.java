package com.java.demo.JavaJpaDemo;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {

	public static void main(String args[]) {
		
		Set<String>hash_set = new HashSet<String>();
		hash_set.add("Geeks");
		hash_set.add("for");
		hash_set.add("Geeks");
		hash_set.add("will work");
		
		System.out.println(hash_set);
		
	}
}
