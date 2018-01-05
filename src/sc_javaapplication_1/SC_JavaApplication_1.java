/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc_javaapplication_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author simone
 */
public class SC_JavaApplication_1 {

    String name;
    int age;

    public static void log(String message) {
        String fullClassName =
                Thread.currentThread().getStackTrace()[2].getClassName();
        String className =
                fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
        String methodName =
                Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber =
                Thread.currentThread().getStackTrace()[2].getLineNumber();

        System.out.println(className + "." + methodName
                         + "(" + lineNumber + "): "
                         + message);
    }
    static float getDisount(int price)
    {
        float discount;
        //log(" price"+price);
        discount = price*20/100;
        //log(" discount"+discount);
        return discount;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 100;
        float discount = getDisount(number);
        log("My First JProgam");
        log("Applico sconto " + number +" - " +getDisount(number)+" -> "
                +(number-discount));
    //    SC_JavaApp.name = "Simone";
    //    age = 40;
    //    log(+name+" anni "+age);

        /* Prova get from console */
        Scanner user_input = new Scanner(System.in);
        int first_Number, second_Number, result;
        System.out.println("Enter first Number:");
        first_Number = user_input.nextInt();
        System.out.println("Enter second Number:");
        second_Number = user_input.nextInt();
        result = first_Number + second_Number;
        System.out.println("Sum :"+result);

        /* Prova  */
        first_Number =
            Integer.parseInt(JOptionPane.showInputDialog("Enter first Number"));
        second_Number =
            Integer.parseInt(JOptionPane.showInputDialog("Enter second Number"));
        result = first_Number + second_Number;
        JOptionPane.showMessageDialog(null, "Sum :"+result);

        /* Prova  */
        String name;
        name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is: " +name);

    }


}
