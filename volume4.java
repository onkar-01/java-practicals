class volume {
    int l, b, h;

    int volume() {
        return l * b * h;
    }
}

public class volume4 {
    public static void main(String[] args) {
        volume v = new volume();
        System.out.println(v.volume());
    }

}
