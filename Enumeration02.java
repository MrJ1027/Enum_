package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Enumeration02 {
    public static void main(String[] args) {
        Season2 spring = Season2.SPRING;
        //Enum类的常用方法
        //1.输出枚举对象的名字
        System.out.println(spring.name());
        //2.ordinal()方法输出的是该枚举对象的编号，从0开始编号
        System.out.println(spring.ordinal());
        //3.values方法返回Season2[]，返回定义的所有枚举对象
        Season2[] values = Season2.values();
        for(Season2 season: values){//增强for循环,类似于for—each吧
            //执行流程是 依次从values数组中取出数据，并赋给season
            System.out.println(season);
        }
        //4.ValueOf,将字符串转化成枚举对象，要求字符串必须为已有的常量名
        //执行流程 根据输入的“SPRING" 到 Season2的枚举对象去查找
        //如果找到了，则返回，如果没有找到，就报错
        Season2 spring1 = Season2.valueOf("SPRING");
        System.out.println("spring1 = " + spring1);

        //5.compareTo,比较两个枚举常量，比较的就是编号
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}
//使用enum关键字实现枚举类
//1.使用关键字enum替代class
//2. public static Season SPRING = new Season("春天","温暖");
//使用 SPRING("春天","温暖");替代 常量名(实参列表)
//3.如果有多个常量，用逗号间隔即可
//4.如果使用enum来实现枚举，要求将定义常量对象写在前面
//5.如果使用无参构造器创建常量对象，可以省去()
enum Season2{

    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");

    private String name;
    private String decs;

    private Season2(String name, String decs) {
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
        return "Season2{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                '}';
    }
}

//用javap反编译Season2，可以知道enum继承了Enum类，而且是一个final类



