package com.maomao.learn.mianxiangduixiang.ch02;

import java.util.Arrays;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/30 12:26
 *********************************************/
public class GenericArrayDemo1<T> {
    private T[] elements;

    public GenericArrayDemo1() {
        this.elements = (T[]) new Object[10];
    }

    public static void main(String[] args) {
        GenericArrayDemo1<String> demo=new GenericArrayDemo1<>();
        String[] elements = demo.elements;
        Arrays.stream(elements).forEach(System.out::println);
    }
}
