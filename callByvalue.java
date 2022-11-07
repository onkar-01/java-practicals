class Test{
    int a=1, b=10;
    void math(int i, int j){
        this.a *= i;
        this.b *= j;
        System.out.println("inside"+ a + " " + b);
    }

}
class callByvalue{
    public static void main(String[] args) {
        Test bv = new Test();
        System.out.println("outside"+ bv.a + " " + bv.b);
        bv.math(2, 3);
        System.out.println("outside"+ bv.a + " " + bv.b);
    }
}