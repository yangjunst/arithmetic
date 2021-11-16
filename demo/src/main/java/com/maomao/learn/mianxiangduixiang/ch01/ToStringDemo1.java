package com.maomao.learn.mianxiangduixiang.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/29 9:32
 *********************************************/
class ToStringSub extends ToStringSuper{
    public ToStringSub(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "ToStringSub{" +
                "name='" + name + '\'' +
                '}';
    }

}
class ToStringSuper{
    protected String name;

    public ToStringSuper(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ToStringSuper{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ToStringDemo1 extends ToStringSub
{
    private  static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public ToStringDemo1(String name)  {
        super(name);
    }

    public static void main(String[] args) {
        ToStringSuper yangjunst = new ToStringDemo1("yangjunst");
        System.out.println(yangjunst);

    }
}
