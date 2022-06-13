import java.util.Scanner;
// Importing of java libraries

public class Main {
    public static void main(String[] args){
        //  You can import different libraries and classes by using the keyword "import" following with the class path you want to import
        //  Ex. in out case we are importing a java class that is stored in the utilities ex. java.util.Scanner
        //  With a Scanner(System.in) we can recognize and store user input in a new line
        //  With nextLine() method we can recognize and store a String input
        //  With nextInt() method we can recognize and store int input

        //  Initilization of a Scanner class
        Scanner _scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = _scanner.nextLine();

        System.out.println("How old are you?");
        int age = _scanner.nextInt();

        System.out.println("Hello, " + name + ", You are " + age + " years old");

    }
}
