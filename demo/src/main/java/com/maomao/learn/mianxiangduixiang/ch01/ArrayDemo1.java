package com.maomao.learn.mianxiangduixiang.ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/29 18:01
 *********************************************/
public class ArrayDemo1 {
    public static int[] getInt() {
        return IntStream.rangeClosed(1,10).toArray();
    }
    public static void main(String[] args) {
        int i = getInt()[3];
        System.out.println(i);
        Integer integer = getIntegerLower()[4];
        System.out.println(integer);
        integer = getIntegerHigher()[6];
        System.out.println(integer);

    }


    public static Integer[] getIntegerHigher() {
        List<Integer> list=new ArrayList<>();
        return IntStream.rangeClosed(1,10).boxed().toArray(Integer[]::new);
    }

    public static Integer[] getIntegerLower() {
        List<Integer> list=new ArrayList<>();
        IntStream.rangeClosed(1,10).boxed().forEach(list::add);
        return list.toArray(new Integer[0]);
    }
}
