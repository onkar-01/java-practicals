class Test {
    int a;

    Test(int a) {
        this.a = a;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

public class Returnobj {
    public static void main(String[] args) {
        Test t = new Test(2);
        Test t2;
        t2 = t.incrByTen();
        System.out.println(t.a + " " + t2.a);
        t2 = t2.incrByTen();
        System.out.println(t.a + " " + t2.a);
    }

}
