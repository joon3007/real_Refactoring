package com.nts.cleancode.collections;

public abstract class AbstractCollection {
	protected Object[] elements = new Object[10];
	protected int size = 0;
	protected boolean readOnly;
	public void addAll(AbstractCollection c) {
			for (int i = 0; i < c.size(); i++) 
				if (!contains(c.get(i))) 
					add(c.get(i));
	
	}

	public abstract boolean remove(Object element);
	public boolean isEmpty() {
		return size == 0;
	}

	public void add(Object element) {
		if (readOnly)
			return;
		
		if (shouldGrow()) 
			grow();
		
		addElement(element);
		
	}

	protected void addElement(Object element) {
		elements[size++] = element;
	}

	protected void grow() {
		Object[] newElements =
			new Object[elements.length + 10];
		for (int i = 0; i < size; i++)
			newElements[i] = elements[i];
		elements = newElements;
	}

	protected boolean shouldGrow() {
		return size + 1 > elements.length;
	}

	public boolean contains(Object element) {
		for (int i=0; i<size; i++) 
			if (elements[i].equals(element))
				return true;
		return false;
	}

	public int size() {
		return size;
	}

	public Object get(int i) {
		return elements[i];
	}

	public int capacity() {
		return elements.length;
	}

}
