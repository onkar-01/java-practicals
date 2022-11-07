import java.util.Scanner;

class count {
    char arr[];
    int top;
    int size;
    String str;

    count(String str, int size) {
        this.str = str;
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        } else {
            arr[++top] = c;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }

    }

    boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    void sizeOF() {
        System.out.println("Size of stack is " + (top + 1));
    }
}

class ParanthesisCounting {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int n = str.length();
        count c = new count(str, n);
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '{') {
                c.push(str.charAt(i));
            } else if (str.charAt(i) == '}') {
                if (c.isEmpty()) {
                    count++;
                } else {
                    c.pop();
                }
            }
        }
        System.out.println("{ : " + count);
        System.out.println("} : " + (c.top + 1));

    }
}