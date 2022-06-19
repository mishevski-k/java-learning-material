public class Main {
    public static void main(String[] args) {
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Leon", "Ibiza", "Altea"}
        };

        for(String[] _cars: cars){
            for(String car: _cars){
                System.out.print(car +" ");
            }
            System.out.println();
        }
    }
}