package com.zhulu.test;

public interface MyIterator {
    public void first();
    public void next();
    public boolean hasNext();
    public boolean isFirst();
    public boolean isLast();
    public Object getCurrentObject();
}
