public class Type_conversion {
    public static void main(String[] args) {
        // Implicit conversion (byte to int)
        byte b = 24;
        int i;

        i = b;  // automatic type conversion
        System.out.println(i);

        //character to int
        char c = 'a';
        int n;
        n = c;
        System.out.println(n);

      //Explicit conversion
      //int to byte
      int t = 300;
      byte y ; // -128 to +127
      
      y = (byte) t;
      System.out.println(y); // 300 % 256 = 44 
      
    }
}