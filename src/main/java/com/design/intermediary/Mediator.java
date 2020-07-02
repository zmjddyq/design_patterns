package com.design.intermediary;


/**
 * @author Shinelon
 * 中介者模式: 中介
 */
public abstract class Mediator {
	public abstract void Register(String colleagueName, Colleague colleague);

	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
