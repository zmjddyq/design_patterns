package com.design.memo;

import java.util.HashMap;

/**
 * @author zmj
 * @date 2020/7/2 9:22
 * @Description 守护者对象, 负责保存多个备忘录对象， 使用集合管理，
 * 提高效率
 */
public class Caretaker {
    /**
     * 保存存档
     */
    private HashMap<Integer, Memento> mementoMap = new HashMap<>();

    public Caretaker() {
    }

    /**
     * 存档
     *
     * @param no
     * @param memento
     */
    public void saveStatus(int no, Memento memento) {
        mementoMap.put(no, memento);
    }

    /**
     * 读档
     *
     * @param no
     * @return
     */
    public Memento getStatus(int no) {
        return mementoMap.get(no);
    }
}
