package com.zhulu.test;

public interface Command {
    public void execute();
}
class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver) {
    	this.receiver = receiver;
    }
	@Override
	public void execute() {
		receiver.ation();
	}
	
}
