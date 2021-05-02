package com.zhulu.test;

import java.lang.ref.WeakReference;
import java.util.List;

public class ConcreteIterator implements MyIterator{
	private int cursor;
	
    private WeakReference<List<Object>> wr;
    
    public ConcreteIterator(List<Object> list) {
		wr = new WeakReference<List<Object>>(list);
	}
	@Override
	public void first() {
		cursor = 0;
	}

	@Override
	public void next() {
		if (cursor < size()) {
			cursor++;
		}
	}
	private int size() {
		return wr.get().size();
	}

	@Override
	public boolean hasNext() {
		if (cursor < size()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFirst() {
		return cursor == 0?true:false;
	}

	@Override
	public boolean isLast() {
		return cursor == (size()-1)?true:false;
	}

	@Override
	public Object getCurrentObject() {
		return wr.get().get(cursor);
	}
	
}
