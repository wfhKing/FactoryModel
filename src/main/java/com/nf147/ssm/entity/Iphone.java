package com.nf147.ssm.entity;

import com.nf147.ssm.dao.Phone;

public class Iphone implements Phone {
    @Override
    public void play() {
        System.out.println("这是苹果");
    }
}
