package com.zhulu.test;


public interface IAggregate {
	public void addObject(Object object);
	public void removeObject(Object object);
	public MyIterator createIterator();
}
