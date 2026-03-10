/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class impal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Masukkan sisi a: ");
        a = input.nextInt();

        System.out.print("Masukkan sisi b: ");
        b = input.nextInt();

        System.out.print("Masukkan sisi c: ");
        c = input.nextInt();

        // Cek sisi negatif atau nol
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Tidak dapat membentuk segitiga.");
        }
        // Cek aturan segitiga
        else if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Tidak dapat membentuk segitiga.");
        }
        // Sama sisi
        else if (a == b && b == c) {
            System.out.println("Segitiga Sama Sisi (Equilateral)");
        }
        // Sama kaki
        else if (a == b || b == c || a == c) {
            System.out.println("Segitiga Sama Kaki (Isosceles)");
        }
        // Siku-siku
        else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
            System.out.println("Segitiga Siku-Siku (Right Triangle)");
        }
        // Segitiga bebas
        else {
            System.out.println("Segitiga Bebas");
        }

        input.close();
    }
}
