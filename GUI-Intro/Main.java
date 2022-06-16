/*

    This is a simple GUI program to enter you name, age and height and display it using the JOptionPane class from java

 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null, "Hello, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double heigh = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
        JOptionPane.showMessageDialog(null, "You are " + heigh + "cm tall");

    }
}
