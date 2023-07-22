package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework05 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧",new Horse());
        tang.common();
        tang.passRiver();
        tang.fire();


    }
}

interface Vehicle{
    void work();
}

class Horse implements Vehicle{
    @Override
    public void work() {
        System.out.println("大路骑马....");
    }
}

class Boat implements Vehicle{
    @Override
    public void work() {
        System.out.println("过河开船....");
    }
}

class Plane implements Vehicle{
    @Override
    public void work() {
        System.out.println("过火焰山开飞机....");
    }
}

class Factory{
    private static Horse horse = new Horse();

    private Factory(){}

    public static Boat getBoat(){
        return new Boat();
    }

    public static Horse getHorse(){
        return horse;
    }

    public static Plane getPlane(){
        return new Plane();
    }
}

class Person{
    private String name;
    private Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    /*
        判断当前的vehicle是不是Boat
        vehicle = null : vehicle instanceof Boat -> false
        vehicle = 马对象 : vehicle instanceof Boat -> false
        vehicle = 船对象 : vehicle instanceof Boat -> true
     */
    public void passRiver(){
        if(!(vehicle instanceof Boat)){
            vehicle = Factory.getBoat();
        }
        vehicle.work();
    }

    public void common(){
        if(!(vehicle instanceof Horse)){
            vehicle = Factory.getHorse();
        }
        vehicle.work();
    }

    public void fire(){
        if(!(vehicle instanceof Plane)){
            vehicle = Factory.getPlane();
        }
        vehicle.work();
    }
}