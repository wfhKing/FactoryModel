package com.nf147.ssm.controller;

import com.nf147.ssm.dao.*;
import com.nf147.ssm.entity.Iphone;
import com.nf147.ssm.entity.Xiaomi;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Iphone();
        p1.play();
        Phone p2 = new Xiaomi();
        p2.play();
        // 这种方法耦合度太高，不方便后期的维护
        // 正所谓 java 没有什么事情是中间加一层不能解决的，进而有了 简单工厂
        System.out.println("==================万恶的分割线==============");

        PhoneFactory p3 = new PhoneFactory();
        p3.createPhone("pg").play();
        p3.createPhone("xm").play();
        // 简单工厂把客户端的耦合降低了，但有使得服务端的 PhoneFactory 和 Phone 耦合太严重
        // 每次要 增删改 某一个 Phone,都要对 PhoneFacotry这个类
        // 进而我们对 简单工厂 继续优化,有了工厂方法模式
        System.out.println("==================万恶的分割线2==============");

        PhoneFactory2 p4 = new IphoneFactory();
        p4.createPhone().play();

        PhoneFactory2 p5 = new XiaomiFactory();
        p5.createPhone().play();
        // 这种方法，把耦合度降到了最低，但同时我们可以发现，我们多次了很多文件
        // 所有不是每一个方法都是完美的，它总是有两面的，看不同的场景用不同的方法


    }
}
