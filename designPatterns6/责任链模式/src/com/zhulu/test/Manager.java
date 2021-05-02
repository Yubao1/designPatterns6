package com.zhulu.test;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest l) {
		if (l.getDay() < 10) {
			System.out.println("员工:" +l.getName() + ",请假天数:" + l.getDay() + ",理由" + l.getReason());
			System.out.println("经理:" + this.name + "审批通过");
		} else {
			if (this.getNextLeader() != null) {
				this.getNextLeader().handleRequest(l);
			}
		}
	}

}
