package com.zhulu.test;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate implements IAggregate{
    private List<Object> list = new ArrayList<Object>();
    @Override
	public void addObject(Object object) {
    	this.list.add(object);
    }
    @Override
    public void removeObject(Object object) {
    	this.list.remove(object);
    }
    @Override
    public MyIterator createIterator() {
    	return new ConcreteIterator(list);
    }
   
}
