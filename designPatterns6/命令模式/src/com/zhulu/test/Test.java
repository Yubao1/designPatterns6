package com.zhulu.test;
/**
 * 测试 命令模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoke invoke = new Invoke(command);
        invoke.call();
	}

}
