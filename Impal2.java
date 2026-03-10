/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author user
 */
import java.util.Scanner;

public class Impal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerAmount;
        int peripheralAmount;
        double baseFee = 0;
        double additionalFee = 0;
        double totalFee;
        boolean outsideBusinessHours;
        boolean dropOffPickup;

        // Input
        System.out.print("Jumlah komputer: ");
        computerAmount = input.nextInt();

        System.out.print("Jumlah peripheral: ");
        peripheralAmount = input.nextInt();

        System.out.print("Servis di luar jam kerja? (true/false): ");
        outsideBusinessHours = input.nextBoolean();

        System.out.print("Customer antar & ambil sendiri? (true/false): ");
        dropOffPickup = input.nextBoolean();

        // DO CASE
        if (computerAmount == 1 || computerAmount == 2) {
            baseFee = 50;
            additionalFee = 0;
        } 
        else if (computerAmount >= 3 && computerAmount <= 10) {
            baseFee = 100;
            additionalFee = 10 * peripheralAmount;
        } 
        else if (computerAmount > 10) {
            baseFee = 500;
            additionalFee = 10 * peripheralAmount;
        }

        if (outsideBusinessHours) {
            baseFee = baseFee * 2;
        }

        totalFee = baseFee + additionalFee;

        if (dropOffPickup) {
            totalFee = totalFee / 2;
        }

        // Output
        System.out.println("Total biaya servis: $" + totalFee);

        input.close();
    }
}
