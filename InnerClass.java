class Outer{
    int x = 10;
    void test(){
        Inner i = new Inner();
        i.display();
    }
    class Inner{
        int y = 20;
        void display(){
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }
    void showXY(){
        System.out.println("x = "+x);
        System.out.println("y = "+new Inner().y);
    }


}
public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.test();
        o.showXY();
    }
}
