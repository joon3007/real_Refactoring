package com.nts.cleancode.collections;

public class Set extends AbstractCollection {
	private static int INITIAL_CAPACITY = 10;
	
	public void add(Object element) {
		if (contains(element))
			return;
		super.add(element);

	}

	public boolean remove(Object element) {
		if (readOnly)
			return false;
		for (int i = 0; i < size; i++)
			if (elements[i].equals(element)) {
				elements[i] = null;
				Object[] newElements = new Object[size - 1];
				int k = 0;
				for (int j = 0; j < size; j++) {
					if (elements[j] != null)
						newElements[k++] = elements[j];
				}
				size--;
				elements = newElements;
				return true;
			}
		return false;
	}
}
