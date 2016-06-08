package com.nts.cleancode.collections;

public class Set extends AbstractCollection {
	private static int INITIAL_CAPACITY = 10;
	
	public void add(Object element) {
		if (contains(element))
			return;
		super.add(element);

	}
}
