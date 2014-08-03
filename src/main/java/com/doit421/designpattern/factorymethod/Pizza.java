package com.doit421.designpattern.factorymethod;

import java.util.ArrayList;

/**
 * Created by czb on 2014/8/3.
 * 产品（披萨）抽象类
 */
public abstract class Pizza {
    String name;//名称
    String dough;//面团
    String sauce;//酱料
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("准备" + name);
        System.out.println("揉面");
        System.out.println("添加酱料");
        System.out.println("添加佐料：");
        for (String topping : toppings) {
            System.out.println(topping + " ");
        }
    }

    void bake() {
        System.out.println("烘烤，350°二十五分钟");
    }

    void cut() {
        System.out.println("切片，切成斜角");
    }

    void box() {
        System.out.println("包装，使用默认披萨盒");
    }
}
