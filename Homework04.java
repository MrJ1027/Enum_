package com.jtl.enum_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework04 {
    public static void main(String[] args) {
        A jtl = new A("JTL");
        jtl.f1();
    }
}

class A{
    private String name;
    public A(String name){
        this.name = name;
    }
    public void f1(){
        class B{
            private final String name;
            public B(String name){
                this.name = name;
            }
            public void show(){
                System.out.println("外部类A的name:" + A.this.name);
                System.out.println("内部类B的name:" + name);
            }
        }

        B b = new B("cqh");
        b.show();
    }
}
