public class Variable {
    public static void main(String[] args) {
        //Integer ---> byte, short, int, long
        // Binary(2), Octal(8), Hexa(16) Num system
        //byte b = 5; decimal
        //byte b = 0b101; // zbinary
        //byte b = 07;  //0 -- 7 --> octal
        //bte b = 0XA; hexa (0 -- 15)
        byte b = 5;
        short s = 10;
        int i = 400;
        long l = 1000;

        //Real number
        float f = 10.54f;
        double d = 23.0987;

        //Charcter

        char c = 'a';    //"a" --> integer ---> binary ---> store
    
        System.out.println("Integer value --->" +b + "," +s +"," +i + ","+l);
        System.out.println("Flaoting values ---->" + f + "," +d);
        System.out.println("Character values ---->" +c);
    }
}