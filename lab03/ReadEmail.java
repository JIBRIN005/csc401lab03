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
public class ReadEmail {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter email address: ");
        String email = input.nextLine();
        int a = email.indexOf("@")+1;
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(a, email.length());
        System.out.printf("Username: %s\n", username);
        System.out.printf("Domain Name: %s\n",domain);
    }
}