/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcjktvr19pn;
import java.util.Scanner;



/**
 *
 * @author pupil
 */
public class App {
    private String repeat = 'yes';
    public void run(){
        
    }
        System.out.println("zzzzzzzzzzzzzz  Калкулятор zzzzzzzzzzzzzzzz");
        do{
            System.out.println("enter first number: ");
            Scanner scanner = new Scanner(System.in);
            double number1 = scanner.nextDouble();
            System.out.println("enter next number : ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("enter option:  (+,-,/.*)"); 
            String znak = scanner.nextLine();
            System.out.print("Score: ");
            if ("+".equals(znak)) {
                System.out.println(number1 + number2);
            }
            if ("-".equals(znak)) {
                System.out.println(number1 - number2);
            }
            if ("*".equals(znak)) {
                System.out.println(number1 * number2);
            }
            if ("/".equals(znak)) {
                System.out.println(number1 / number2);
                if (number2 == 0);
                System.out.println("На ноль незя");
            }




            System.out.print("Score: ");
            System.out.println("Для продолжения нажмите\'y'\, Для выхода нажмите другую;"
            repeat = scanner.nextLine();
        }while(repeat.equals('y'));
        System.out.println("zzzzzz end zzzzzzzz");
}
