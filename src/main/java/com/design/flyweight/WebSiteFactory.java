package com.design.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author zmj
 * @date 2020/6/30 11:02
 * @Description
 */
public class WebSiteFactory {
    // 建立池子
    private HashMap<String,WebSite> webSiteHashMap = new HashMap<>();

    /**
     * 获取一个实例
     * @param type
     * @return
     */
    public WebSite get(String type){
        WebSite webSite = webSiteHashMap.get(type);
        if (webSite == null) {
            webSite = new ConcreteWebSite(type);
            webSiteHashMap.put(type,webSite);
        }
        return webSite;
    }
    /**
     * 获取池子总数
     */
    public void showSize(){
        System.out.println("池子大小为: " + webSiteHashMap.size());
    }
}
