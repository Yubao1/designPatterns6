package com.zhulu.test;
/**
 * 测试责任链模式
 * @author Administrator
 *
 */
public class Test {

	
	public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GaneralManager("王五");
        a.setNextLeader(b);
        b.setNextLeader(c);
        LeaveRequest lr = new LeaveRequest("小二", 16, "娶老婆");
        LeaveRequest lr2 = new LeaveRequest("小六", 31, "去相亲");
        a.handleRequest(lr);
        a.handleRequest(lr2);
	}

}
