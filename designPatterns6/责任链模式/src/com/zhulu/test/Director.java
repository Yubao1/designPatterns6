package com.zhulu.test;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest l) {
		if (l.getDay() < 3) {
			System.out.println("员工:" +l.getName() + ",请假天数:" + l.getDay() + ",理由" + l.getReason());
			System.out.println("主任:" + this.name + "审批通过");
		} else {
			if (this.getNextLeader() != null) {
				this.getNextLeader().handleRequest(l);
			}
		}
	}

}
