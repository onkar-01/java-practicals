class findFact {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class Factorial {
    public static void main(String[] args) {
        findFact f = new findFact();
        System.out.println(f.fact(4));
    }

}
