class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equals(Test t) {
        return (a == t.a && b == t.b);
    }

}

public class checkObject {
    public static void main(String[] args) {
        Test t1 = new Test(10, 20);
        Test t2 = new Test(10, 20);
        Test t3 = new Test(30, 40);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }

}
