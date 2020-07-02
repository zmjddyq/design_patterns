package com.design.command;

/**
 * @author zmj
 * @date 2020/7/1 9:19
 * @Description 调用者: 遥控器
 */
public class Invoker {
    /**
     * 存放开命令
     */
    private Command[] onCommands;
    /**
     * 存放关命令
     */
    private Command[] offCommands;

    private Command UndoCommand;

    private static final int COMMAND_NUM = 5;

    public Invoker() {
        this(COMMAND_NUM);
    }

    public Invoker(int size) {
        onCommands = new Command[size];
        offCommands = new Command[size];

        for (int i = 0; i < size; i++) {
            onCommands[i] = new UnCommand();
            offCommands[i] = new UnCommand();
        }
    }

    /**
     * 添加命令
     *
     * @param no         第几个命令
     * @param onCommand  开命令
     * @param offCommand 关命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 执行开命令
     *
     * @param no 执行开命令的编号
     */
    public void InvokerOn(int no) {
        onCommands[no].execute();
        UndoCommand = onCommands[no];
    }

    /**
     * 执行关命令
     * @param no
     */
    public void InvokerOff(int no) {
        offCommands[no].execute();
        UndoCommand = offCommands[no];
    }

    /**
     * 撤销上条执行的命令
     */
    public void InvokerUndo() {
        UndoCommand.undo();
    }

}
