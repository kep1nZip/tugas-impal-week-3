/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class impal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data pada ACCOUNTS
        int validAccountNumber = 12345;
        String statusCode = "valid";

        int accountNumber;
        double amountOfSale;

        System.out.print("Masukkan account number: ");
        accountNumber = input.nextInt();

        // Precondition 1
        if (accountNumber == validAccountNumber && statusCode.equals("valid")) {

            System.out.print("Masukkan amount of sale: ");
            amountOfSale = input.nextDouble();

            // Postcondition 1
            System.out.println("Invoice produced:");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Amount of Sale: $" + amountOfSale);

        } else {
            // Precondition 2 & Postcondition 2
            System.out.println("Error: Account number tidak ditemukan atau status tidak valid.");
        }

        input.close();
    }
}
