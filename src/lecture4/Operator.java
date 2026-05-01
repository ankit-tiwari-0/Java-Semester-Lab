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
       
        int i = 6;
        i++; // here increase by 1, i = i + 1--> i +=1;
        i--;

        System.out.println(i);//7

        //pre increment and post increament/decrement

        int j = 7;
        j++;//postfix increment
        ++j;//prefix increment

        // 9
        int k = j++; //k = j; j = j +1;here first assiqn val to k then increase by 1
        System.out.println(j+ "," + k);
        int l = ++j; //l = j + 1;

        System.out.println(j + "," +l);//11,11

        

    }
}