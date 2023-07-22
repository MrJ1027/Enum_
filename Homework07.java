package com.jtl.enum_;

import java.util.Scanner;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework07 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch(green){
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
        }
    }
}

enum Color implements showColor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    private int redValue;
    private int greenValue;
    private int blueValue;

    @Override
    public void show() {
        System.out.println("redValue=" + redValue);
        System.out.println("blueValue=" + blueValue);
        System.out.println("greenValue=" + greenValue);
    }
}

interface showColor{
    void show();
}

