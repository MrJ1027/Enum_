package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}

abstract class Animal{
    abstract public void shout();
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫...");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫...");

    }
}
