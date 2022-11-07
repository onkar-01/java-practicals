class volume {
    int l, b, h;

    void setValue() {
        l = 10;
        b = 20;
        h = 30;
    }

    int volume() {
        return l * b * h;
    }
}

public class volume5 {
    public static void main(String[] args) {
        volume v = new volume();
        v.setValue();
        System.out.println(v.volume());
    }

}
