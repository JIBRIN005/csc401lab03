/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingInput;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author Jibrin Yahaya
 */
public class ReadingInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Please enter your name: ");
       String name = input.nextLine();
       
       System.out.print("Now enter your age: ");
       int age = input.nextInt();
       
       System.out.print("Enter amount to donate: ");
       Double amount = input.nextDouble();
       
       System.out.printf("Mr. %s after one year you will be %d years old\n",name,(age+1));
       System.out.printf("This is the amount you donated $%,.2f", amount);
    }
    
}
