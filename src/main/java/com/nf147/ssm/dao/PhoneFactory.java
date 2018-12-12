package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Iphone;
import com.nf147.ssm.entity.Xiaomi;

public class PhoneFactory {
    public Phone createPhone(String tag){
        if (tag.equals("pg")){
            return new Iphone();
        } else if (tag.equals("xm")){
            return new Xiaomi();
        }
        return null;
    }
}
