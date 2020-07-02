package com.design.command;

/**
 * @author zmj
 * @date 2020/7/1 9:21
 * @Description 空命令:可以实现空实现，减少对空命令的判断
 */
public class UnCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
