package eduit.mj.casting;


class A {
    public void m1() {
        System.out.println("A::m1");
    }
}

class B extends A {
    public void m1() {
        System.out.println("B::m1");
    }
}

class C extends B {
    public void m1() {
        System.out.println("C::m1");
    }
}

public class Init {
    private static Object instanciar(String obj) throws Exception {
        Object o = Class.forName(obj).newInstance();
        return o;
    }
    public static void main(String... params) throws Exception {
        A a = (A)instanciar("eduit.mj.casting.C");
        a.m1();
    }
}
