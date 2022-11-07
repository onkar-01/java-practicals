class  Test{
    int a,b;
    Test(int a, int b){
        this.a = a;
        this.b = b;
    }
    void math(Test t){
        t.a *= 2;
        t.b *= 3;
    }
}
class callByRef{
    public static void main(String[] args) {
        Test bv = new Test(1, 10);
        System.out.println("outside"+ bv.a + " " + bv.b);
        bv.math(bv);
        System.out.println("outside"+ bv.a + " " + bv.b);
    }
}