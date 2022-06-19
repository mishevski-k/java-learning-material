import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIf-Statement");
        System.out.println("Please enter your age!");
        int age = input.nextInt();

        if(age >= 75){
            System.out.println("You are a elder");
        }else if(age >= 18){
            System.out.println("You are an adult!");
        }else if(age >= 13){
            System.out.println("You are an teenager!");
        }else{
            System.out.println("You are a minor");
        }

        System.out.println("\nSwitch-Statements");
        System.out.println("Please enter a day of the week!");
        input = new Scanner(System.in);
        String day = input.nextLine();

        switch(day){
            case "Sunday": System.out.println("It is Sunday!");
                break;
            case "Monday": System.out.println("It is Monday!");
                break;
            case "Tuesday": System.out.println("It is Tuesday!");
                break;
            case "Wednesday": System.out.println("It is Wednesday!");
                break;
            case "Thursday": System.out.println("It is Thursday!");
                break;
            case "Friday": System.out.println("It is Friday!");
                break;
            case "Saturday": System.out.println("It is Saturday!");
                break;
            default: System.out.println("The input was formed incorrectly or is not a day of the week!");
        }
    }
}