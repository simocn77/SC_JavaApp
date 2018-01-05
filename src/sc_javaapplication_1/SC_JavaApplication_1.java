/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc_javaapplication_1;

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
    }


}
