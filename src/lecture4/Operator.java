package lecture4;

public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println(c + "," + d + "," + e + "," + f + "," + g);

        int h = a + 2;

        h = h + 2; //since this is okay in cse
        h += 2; //h =h +2

        h -= 2; // h = h - 2
        System.out.println(h);

    }
}