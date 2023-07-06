//Define a method checkScore that takes a double score as input parameter
//
//        if 0 < score <= 50.00 then print Average score
//
//        if 50.00 < score <= 100.00 the print Very good score
//
//        in all other cases throw an ArithmeticException with the message Score is out of scale!
//
//        test the method with the following values:
//
//        2.15
//        50
//        95.02
//        100.01

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert a number: ");
        Scanner userInput = new Scanner(System.in).useLocale(Locale.US);
        // Mi dava InputMismatchException, quindi ho aggiunto .useLocale(Locale.US) to sets this scanner's locale object to the specified locale.
        // The Java Locale class object represents a specific geographic, cultural, or political region.
        // se non mettessi .useLocale(Locale.US) dovrei inserire i decimali con la virgola e non con il punto perché il locale italiano, di default il mio, vuole le decimali con la virgola

        double inputNumber = userInput.nextDouble();

        checkScore(inputNumber);
    }
    public static void checkScore(double score) {
        try{
            if (score > 0 && score <= 50.00) {
                System.out.println("Average score");
            } else if(score > 50.00 && score <= 100.00) {
                System.out.println("Very good score");
            } else {
                throw new ArithmeticException("score is out of scale!");
            }
        } catch (ArithmeticException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}