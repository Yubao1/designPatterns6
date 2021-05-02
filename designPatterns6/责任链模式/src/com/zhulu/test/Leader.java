package com.zhulu.test;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	public Leader getNextLeader() {
		return nextLeader;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
    public abstract void handleRequest(LeaveRequest l);
}
