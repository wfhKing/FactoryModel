package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Iphone;

public class IphoneFactory implements PhoneFactory2 {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
