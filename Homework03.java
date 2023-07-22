package com.jtl.enum_;

import javafx.scene.control.Cell;

import javax.swing.*;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //匿名内部类 同时也是一个对象
        cellphone.testWork(new Calculate() {
            @Override
            public void work() {
                System.out.println("匿名内部类的work方法");
            }
        });

    }
}

interface Calculate{
    void work();
}

class Cellphone implements Calculate{
    @Override
    public void work() {
        System.out.println("手机计算器，启动！！！");
    }

    public void testWork(Calculate ICal){
        ICal.work();
        System.out.println("调用完毕");
    }
}
