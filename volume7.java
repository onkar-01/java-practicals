class volume {
    int l, b, h;

    volume(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume() {
        return l * b * h;
    }
}

public class volume7 {
    public static void main(String[] args) {
        volume v = new volume(10, 20, 30);
        System.out.println(v.volume());
    }
}
