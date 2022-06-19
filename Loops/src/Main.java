import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  While loop: executes a block of code as long as it's condition remains true, must have a counter and counter-increment defined besides the actual loop
        //  Do-While loop: executes a block of code as long as it's condition is true, it differs from a while loop because here the code is first run and then the condition is checked, must have a counter and counter-increment defined
        //  For loop: executes a block of code as long as it's condition is true, It differs from a while and do-while loop, because in its syntax it contains the counter and increment defined, where's in while loop you need to make a counter standalone
        System.out.println("Please choose the index of the loop you want to try");
        System.out.println("Index:\tName:");
        System.out.println("1:\t\tFor loop");
        System.out.println("2:\t\tWhile loop");
        System.out.println("3:\t\tDo-While loop");
        Scanner loopType = new Scanner(System.in);
        if(loopType.hasNextInt()){
            int methodType = loopType.nextInt();
            if(methodType == 1){
                System.out.println("You choose a For loop");
                int start = 0;
                int end = 10;
                int increment = 1;
                System.out.println("Starting number: " + start + "\nEnd number: " + end + "\nIncrement: " + increment);
                for (int i = start; i < end; i = i + increment){
                    System.out.println(i);
                }
            }else if(methodType == 2){
                System.out.println("You choose a While loop");
                int start = 0;
                int end = 10;
                int increment = 1;
                System.out.println("Starting number: " + start + "\nEnd number: " + end + "\nIncrement: " + increment);
                int i = start;
                while(i < end){
                    System.out.println(i);
                    i = i + increment;
                }
            }else if(methodType == 3){
                System.out.println("You choose a Do-While loop");
                int start = 0;
                int end = 10;
                int increment = 1;
                System.out.println("Starting number: " + start + "\nEnd number: " + end + "\nIncrement: " + increment);
                int i = start;
                do{
                    System.out.println(i);
                    i = i + increment;
                }while(i < end);
            }else {
                System.out.println("The method you choose does not exist");
            }
        }else{
            System.out.println("Incorrect format");
        }
        loopType.close();
    }
}