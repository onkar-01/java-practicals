class volume {
    int l, b, h;

    void setValue(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume() {
        return l * b * h;
    }
}

public class volume3 {
    public static void main(String[] args) {
        volume v = new volume();
        v.setValue(10, 20, 30);
        System.out.println(v.volume());
    }

}
