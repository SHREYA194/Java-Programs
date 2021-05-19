package javaapplication3;

public class TestMultipleInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.a();
        obj.b();
        obj.c();
    }
}
interface A {
    public void a();
}
interface B {
    public void b();
}
class C implements A,B {
    @Override
    public void a() {
        System.out.println("C implements A...");
    }
    
    @Override
    public void b() {
        System.out.println("C implements B...");
    }
}
class D extends C {
    public void c() {
        System.out.println("D extends C...");
    }
}