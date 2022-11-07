class findFab {
    int fab(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fab(n - 1) + fab(n - 2);
    }
}

class Fabonacci {
    public static void main(String[] args) {
        findFab f = new findFab();
        System.out.println(f.fab(10));
    }
}