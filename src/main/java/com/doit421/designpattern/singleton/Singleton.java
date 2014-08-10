package com.doit421.designpattern.singleton;

/**
 * Created by czb on 2014/8/10.
 * 单件模式
 */
public class Singleton {
    private volatile static Singleton single;
    private Singleton(){}
    public static Singleton getInstance(){
        if(single==null){
            synchronized (Singleton.class){
                if(single==null){
                    single=new Singleton();
                }
            }
        }
        return single;
    }
    public void go(){
        System.out.println("单件模式");
    }
}
