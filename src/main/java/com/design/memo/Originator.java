package com.design.memo;

/**
 * @author zmj
 * @date 2020/7/2 9:22
 * @Description 对象(需要保存
 *状态的对象)
 */
public class Originator {
    private String status;

    public Originator(String status) {
        this.status = status;
    }

    public Originator() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento saveStatus(){
        return new Memento(status);
    }

    public void recoverStatus(Memento memento) {
        status = memento.getStatus();
    }
}
