package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

// IP : store bookID and Book objects / insert update search delete
public class HashMapEx {
	public static void main(String[] args) {
		mapOperations();
	}

	private static void mapOperations() {
		// Map countryCodeMap = new HashMap<int, String>();
		Map<Integer, String> countryCodeMap = new HashMap<Integer, String>();
		System.err.println(countryCodeMap.isEmpty());
		countryCodeMap.put(91, "India");
		countryCodeMap.put(33, "Germany");
		countryCodeMap.put(81, "Japan");
		System.err.println(countryCodeMap.isEmpty());
		// {Japan=81, 91=India, France=33}
		System.err.println(countryCodeMap);
		// countryCodeMap.clear();
		System.err.println(countryCodeMap.isEmpty());
		countryCodeMap.put(33, "France");
		System.err.println(countryCodeMap);
		countryCodeMap.remove(33);
		System.err.println(countryCodeMap);
		System.err.println(countryCodeMap.size());
		// search
		boolean countryCodeFound = countryCodeMap.containsKey(91);
		System.err.println(countryCodeFound);
		boolean countryValueFound = countryCodeMap.containsValue("India");
		System.err.println(countryValueFound);
		countryCodeFound = countryCodeMap.containsKey(911);
		System.err.println(countryCodeFound);
		countryValueFound = countryCodeMap.containsValue("Indiaa");
		System.err.println(countryValueFound);
	}
}
