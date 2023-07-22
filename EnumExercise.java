package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class EnumExercise {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for(Week days: values){
            System.out.println(days);
        }
        Week.MONDAY.f1();

    }
}

//enum不能再继承，因为已经继承了Enum类，但是可以实现接口
//enum实现的枚举类，仍然是一个类，所以还是可以实现接口
enum Week implements InterfaceA{
    MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),
    FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");
    private String name;
    private Week(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void f1() {
        System.out.println("重写接口方法");
    }
}

interface InterfaceA{
    void f1();
}
