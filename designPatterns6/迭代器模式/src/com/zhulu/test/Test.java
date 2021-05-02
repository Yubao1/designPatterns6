package com.zhulu.test;
/**
 * 测试迭代器模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		IAggregate aggregate = new ConcreteMyAggregate();
		aggregate.addObject("公众号小二玩编程");
		aggregate.addObject("bb");
		aggregate.addObject("cc");
		aggregate.addObject("dd");
        MyIterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
        	String msg = "遍历数据----" + iterator.getCurrentObject();
        	System.out.println(msg);
        	iterator.next();
        }
	}

}
