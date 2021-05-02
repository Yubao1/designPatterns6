package com.zhulu.test;

public class GaneralManager extends Leader{

	public GaneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest l) {
		if (l.getDay() < 30) {
			System.out.println("员工:" +l.getName() + ",请假天数:" + l.getDay() + ",理由" + l.getReason());
			System.out.println("总经理:" + this.name + "审批通过");
		} else {
			System.out.println("你离职吧");
		}
	}

}
