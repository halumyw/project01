package com.atlxt.bean;

/**
 * @author lxtlxt
 * @create 2022-05-14-17:07
 */
public class Person {
    public void eat(){//ctrl+alt+h 查看重写树
        extracted();
    }
//recent files (ctrl+e)
    private void extracted() {//ctrl+alt+m
        System.out.println("吃饭");
    }
}
