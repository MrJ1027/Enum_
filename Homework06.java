package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework06 {
    public static void main(String[] args) {
        Car car = new Car(70);
        Car car1 = new Car(30);
        Car car2 = new Car(-10);
        car.new Air().flow();
        car1.new Air().flow();
        car2.new Air().flow();
        System.out.println("===============");
        car.getAir().flow();
        car1.getAir().flow();
        car2.getAir().flow();

    }
}

class Car{
    private double temperature;
    public Car(double temperature){
        this.temperature = temperature;
    }

    public Air getAir(){
        return new Air();
    }
    class Air{
        public void flow(){
            if(temperature > 40) {
                System.out.println("车内空调吹冷气...");
            }else if(temperature < 0){
                System.out.println("车内空调吹暖气...");
            }else{
                System.out.println("车内空调关闭...");
            }
        }
    }
}
