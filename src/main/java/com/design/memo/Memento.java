package com.design.memo;

/**
 * @author zmj
 * @date 2020/7/2 9:21
 * @Description 备忘录对象, 负责
 * 保存好记录，即Originator内部
 * 状态
 */
public class Memento {
    /**
     * 保存状态
     */
    private String status;

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
