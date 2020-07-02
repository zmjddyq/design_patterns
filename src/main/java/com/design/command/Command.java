package com.design.command;

/**
 * @author zmj
 * @date 2020/7/1 9:11
 * @Description 命令模式,命令角色，具体命令接受者可以实现的命令
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
