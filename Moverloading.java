class methodOverloading {
    int l, b, h;

    methodOverloading() {
        l = b = h = -1;
    }

    methodOverloading(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    methodOverloading(int l) {
        this.l = this.b = this.h = l;
    }

    int volume() {
        return -1;
    }

    int volume(int l) {
        return l * l * l;
    }

    int volume(int l, int b, int h) {
        return l * b * h;
    }
}

public class Moverloading {
    public static void main(String[] args) {
        methodOverloading v1 = new methodOverloading();
        System.out.println(v1.volume());
        System.out.println(v1.volume(4));
        System.out.println(v1.volume(4, 5, 6));
        methodOverloading v2 = new methodOverloading(7);
        System.out.println(v2.volume());
        System.out.println(v2.volume(4));
        System.out.println(v2.volume(4, 5, 6));
        methodOverloading v3 = new methodOverloading(5, 6, 7);
        System.out.println(v3.volume());
        System.out.println(v3.volume(4));
        System.out.println(v3.volume(4, 5, 6));
    }

}
