class sVar {
    static int a = 3;
    static int b;

    static void meth(int i) {
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
    }

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }
}

public class StaticVar {
    public static void main(String[] args) {
        sVar.meth(42);
    }
}
