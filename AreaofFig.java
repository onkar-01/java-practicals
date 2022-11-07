import java.util.Scanner;

class areaOfFigure {
    int side;

    areaOfFigure(int side) {
        this.side = side;
    }

    int areaOfSquare() {
        return side * side;
    }
}

public class AreaofFig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        areaOfFigure a = new areaOfFigure(side);
        System.out.println(a.areaOfSquare());

    }
}