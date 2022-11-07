class Acontrol{
    int a;
    public int b;
    private int c;
    void setC(int i){
        a=i;
    }
    int getC(){
        return c;
    }
}
public class AccessControl {
    public static void main(String[] args) {
        Acontrol ac = new Acontrol();
        ac.a=10;
        ac.b=20;
        ac.setC(30);
        System.out.println(ac.a + " " + ac.b + " " + ac.getC());
    }
}
