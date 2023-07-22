package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework01 {
    public static void main(String[] args) {
        Flock flock = new Flock();
        Flock flock1 = new Flock();
        Flock flock2 = new Flock();
        System.out.println(flock.getSerialNumber());
        System.out.println(flock1.getSerialNumber());
        System.out.println(flock2.getSerialNumber());
    }
}

class Flock{
    private static int currentNum = 100000;
    private int serialNumber;
    public Flock(){
        serialNumber = getNextNum();
    }
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
