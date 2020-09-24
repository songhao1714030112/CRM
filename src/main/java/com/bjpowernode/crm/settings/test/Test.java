package com.bjpowernode.crm.settings.test;

import com.bjpowernode.crm.utils.DateTimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //验证失效时间
        String expireTime = "2020-10-10 10:10:10";
        //当前系统时间
        String currentTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(currentTime);
        System.out.println(currentTime);

        String lockState = "0";
        if("0".equals(lockState)){

        }

        String ip = "192.168.1.1";
        String allowIps = "192.168.1.1,192.168.1.2";
        if (allowIps.contains(ip)){

        }
    }
}
