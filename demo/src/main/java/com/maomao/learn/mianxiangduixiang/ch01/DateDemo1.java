package com.maomao.learn.mianxiangduixiang.ch01;

import java.util.Date;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/29 8:20
 *********************************************/
public class DateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(1921);
        date.setMonth(1);
        System.out.println(date.toLocaleString());
    }
}
