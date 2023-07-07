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
        try{
            checkScore(2.15);
            checkScore(50);
            checkScore(95.02);
            checkScore(100.01);
        } catch (ArithmeticException exception) {
            System.out.println("Error: " + exception.getMessage());
            //exception.printStackTrace(); //mostra la riga esatta in cui si ha l'eccezione
        }
    }
    public static void checkScore(double score) {
        if (score > 0 && score <= 50.00) {
            System.out.println("Average score");
        } else if(score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("score is out of scale!");
        }
    }
}