package com.nts.cleancode.collections;

public abstract class AbstractCollection {
	public void addAll(AbstractCollection c) {
		if (c instanceof Set) {
			Set s = (Set) c;
			for (int i = 0; i < s.size(); i++) {
				if (!contains(s.get(i))) {
					add(s.get(i));
				}
			}

		} else if (c instanceof List) {
			List l = (List) c;
			for (int i = 0; i < l.size(); i++) {
				if (!contains(l.get(i))) {
					add(l.get(i));
				}
			}
		} 
	}

	public abstract boolean isEmpty();
	public abstract void add(Object element);
	public abstract boolean remove(Object element);
	public abstract boolean contains(Object element);
	public abstract int size();

}
