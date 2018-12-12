package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Xiaomi;

public class XiaomiFactory implements PhoneFactory2 {
    @Override
    public Phone createPhone() {
        return new Xiaomi();
    }
}
