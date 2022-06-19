public class Main {
    public static void main(String[] args) {
        String name = "Kiril";

        //boolean result = name.equalsIgnoreCase(name);
        //int result = name.length();
        //char result = name.charAt(0);
        //int result  = name.indexOf("l");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('i', 'y');

        System.out.println(result);
    }
}