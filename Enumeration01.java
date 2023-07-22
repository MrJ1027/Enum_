package com.jtl.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

//自定义枚举实现
class Season{
    private String name;
    private String decs;
    //定义四个对象已经固定了
    public static Season SPRING = new Season("春天","温暖");
    public static Season SUMMER = new Season("夏天","炎热");
    public static Season AUTUMN = new Season("秋天","凉爽");
    public static Season WINTER = new Season("冬天","寒冷");
    //1.构造器私有化，目的是防止直接new对象
    //2.不写set方法，防止属性被修改
    //3.优化，可以加入final修饰符
    //4.枚举对象名通常全部大写，命名规范
    private Season(String name, String decs) {
        this.name = name;
        this.decs = decs;
    }

    public String getName() {
        return name;
    }

    public String getDecs() {
        return decs;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                '}';
    }
}