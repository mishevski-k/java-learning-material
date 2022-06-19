import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Logical Operators: used to connect two or more expressions

            && (AND): Both conditions must be true
            || (OR): Either condition must be true
            ! (NOT): reverses boolean value of condition
         */

        Scanner input = new Scanner(System.in);
        System.out.println("For simulation, please enter the temperature of the machine");
        int temp = input.nextInt();

        if(temp <= 0){
            System.out.println("The machiness temperature is around zero degrees please check if the machine is operating");
        }else if(temp > 0 && temp < 30){
            System.out.println("The machiness temperature is below the optimal working condition, please check the machine");
        }else if(temp >= 30 && temp < 75){
            System.out.println("The machine's temperature is on optimal working condition");
        }else if(temp >= 75 && temp < 100){
            System.out.println("The machine's temperature exceeded the optimal working conditions, but is not on a critical point, please check the cooling ");
        }else if(temp > 100){
            System.out.println("The machine is overheating, please turn-off and check the cooling");
        }else{
            System.out.println("The temperature System doesn't respond, please turn-off the machine and check it");
        }
    }
}