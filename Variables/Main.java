public class Main {
    public static void main(String[] args){
        //  Data types
        //  date type   size    primitive/  value
        //                      reference

        //  boolean     1 bit   primitive   true or false
        //  byte        1 byte  primitive   -128 to 127
        //  short       2 bytes primitive   -32,768 to 32,767
        //  int         4 bytes primitive   -2 billion to 2 billion
        //  long        8 bytes primitive   -9 quintillion to 9 quintillion
        //  float       4 bytes primitive   fractional number up to 6-7 digits ex. 3.141592f **Must have 'f' suffix at the end of the value
        //  double      8 bytes primitive   fractional number up to 15 digits ex. 3.14.1592653589793
        //  char        2 bytes primitive   single character/letter/ASCII value ex. 'f'
        //  String      varies  reference   a sequence of characters ex. "Hello World!"


        //  Primitive versus Reference data types
        //  Primitive                       vs      Reference

        //  - 8 types (bollean, byte,etc.           - unlimited (user defined)
        //  - stores data                           - stores and address
        //  - can only hold 1 value                 - could hold more than 1 value
        //  - less memory                           - more memory
        //  - fast                                  - slower


        //Variable declaration, assignment and initialization
        //int x;        declaration
        //                  +
        //x = 123;      assignment
        //                  =
        //int x = 123;  initialization

        boolean _boolean = false;
        System.out.println("This is a boolean data type, and its value is: " + _boolean);

        byte _byte = 123;
        System.out.println("This is a byte data type, and its value is: " + _byte);

        short _short = 15678;
        System.out.println("This is a short data type, and its value is: " + _short);

        int _int = 1999999768;
        System.out.println("This ia a int data type, and its value is: " + _int);

        long _long = 111111111;
        System.out.println("This a long data type, and its value is: " + _long);

        float _float = 3.141592f;
        System.out.println("This ia a float data type, and its value is: " + _float);

        double _double = 3.141592653589793;
        System.out.println("This is a double data type, and its value is: " + _double);

        char _char = '@';
        System.out.println("This is a char data type, and its value is: " + _char);

        String _string = "Hello, world!";
        System.out.println("This is a string data type, and its value is: " + _string);

        String firstVariable = "water";
        String secondVariable = "Kool-Aid";

        System.out.println("\nBefore swap");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);

        String swapVariable = firstVariable;

        firstVariable = secondVariable;
        secondVariable = swapVariable;

        System.out.println("\nAfter swap");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);
    }
}
