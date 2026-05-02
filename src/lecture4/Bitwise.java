package lecture4;

public class Bitwise {
   public static void main(String[] args) {
    // Bitwise operations
    int a = 2; // 10 ---> 00000000 00000000 00000000 00000010 
    int b = 3; // 11 --> 00000000 00000000 00000000 00000011
    int c = a & b; // 10 --> 2
    int d = a | b; // 11 --> 3
    int e = a^b; // 01 -- 1
    int f = ~a; //

    System.out.println(c + "," +d+","+e+","+f);
    //shift operations
    int g = 1; // 00000000 00000000 00000000 00000001 --> 1 
    g = g << 30;// 01000000 00000000 00000000 00000000 
    System.out.println(g);

    

   } 
}
