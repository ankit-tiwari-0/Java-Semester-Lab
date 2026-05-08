
public class conditional {
     public static void main(String[] args) {

        int i = 5;

        if (i == 5) {
            System.out.println("i is 5");
        } else {
            System.out.println("i is not");
        }

        int o = 6;
         
        if (o % 2 != 0) {
            
            System.out.println("o is even");
        }
        else{
            System.out.println("o is odd");
        }
 

       // if-else-if ladder


        int age = 10;

        if (age>80) {
            System.out.println("u ate old");
        }

        else if (age>60) {
            System.out.println("u are old to");
        }
        else if (age>40) {
            System.out.println("u are becoming old");
        }
        else if (age>20) {
            System.out.println("u are young");
        }
        else {
            System.out.println("bachha hai abi tu");
        }
    } 
}