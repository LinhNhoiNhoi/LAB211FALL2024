
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class CheckInput {

    public static Scanner sc = new Scanner(System.in);

    public static int checkInt() {
        while (true) {

            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.err.println("Please enter the positive number ");
                }
                return n;

            } catch (NumberFormatException ex) {
                System.err.println("Wrong format, please input an integer");
            }

        }

    }

}
