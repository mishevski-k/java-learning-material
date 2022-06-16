import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random dice = new Random();

//        int x = dice.nextInt(6);
//        double y = dice.nextDouble();
        boolean z = dice.nextBoolean();
        System.out.println(z);
    }
}
