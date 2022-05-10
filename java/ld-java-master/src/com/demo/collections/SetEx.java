package com.demo.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// no duplicates / no insertion order
public class SetEx {
public static void main(String[] args) {
	differentObjects();
	useGenerics();
	noOrder();
	sortedTreeSet();
}
	private static void differentObjects() {
		System.out.println("");
//		Cannot instantiate the type Set
//		Set scoreSet = new Set();
		// different objects
		Set objectSet = new HashSet();
		Integer integer = 100;
		Float float1 = 200f;
		Float float2 = 200f;
		boolean boolean1 = true;
		objectSet.add(integer);
//		no duplicates
		objectSet.add(float1);
		objectSet.add(float2);
		objectSet.add(boolean1);
		// allows single null
		objectSet.add(null);
		objectSet.add(null);
		System.err.println(objectSet);
	}
	private static void useGenerics() {
		System.out.println("");
//		Cannot instantiate the type Set
//		Set scoreSet = new Set();
		// different objects
		Set<Float> objectSet = new HashSet<Float>();
		Integer integer = 100;
		Float float1 = 200f;
		Float float2 = 200f;
		boolean boolean1 = true;
//		objectSet.add(integer);
//		no duplicates
		objectSet.add(float1);
		objectSet.add(float2);
//		objectSet.add(boolean1);
		// allows single null
		objectSet.add(null);
		objectSet.add(null);
		System.err.println(objectSet);
	}
	private static void noOrder() {
		System.out.println("");
//		Cannot instantiate the type Set
//		Set scoreSet = new Set();
		// different objects
		Set scoreSet = new HashSet();
//		no order
		scoreSet.add(3000);
		scoreSet.add(400);
		scoreSet.add(5300);
		scoreSet.add(300);
		System.err.println(scoreSet);
	}
	private static void sortedTreeSet() {
		System.out.println("");
//		Cannot instantiate the type Set
//		Set scoreSet = new Set();
		// different objects
		Set scoreSet = new TreeSet();
//		no order
		scoreSet.add(3000);
		scoreSet.add(400);
		scoreSet.add(5300);
		scoreSet.add(300);
		System.err.println(scoreSet);
	}
}
