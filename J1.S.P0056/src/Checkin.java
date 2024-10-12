
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Checkin {

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

    public static String checkStringNull() {
        while (true) {
            String code = sc.nextLine().trim();
            if (code.isEmpty()) {
                System.err.println("Code null");
                System.out.print("Enter again: ");

            }
            return code;
        }
    }

    public static boolean checkDuplicated(String code, ArrayList<Worker> listWorker) {
        if (listWorker.isEmpty()) {
            return true;
        }
        for (int i = 0; i < listWorker.size(); i++) {
            if (code.equalsIgnoreCase(listWorker.get(i).code)) {

                return false;

            }

        }
        return true;
    }

    public static int checkAge() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n >= 18 && n <= 50) {
                    return n;
                } else {
                    System.err.println("Out of range from 18 to 50 ");
                    System.out.println("Please enter again: ");
                }

            } catch (NumberFormatException ex) {
                System.err.println("Wrong format, please input an integer");
                System.out.println("Please enter again: ");
            }

        }

    }

    public static Double checkDouble() {
        while (true) {

            try {
                double n = Double.parseDouble(sc.nextLine().trim());
                if (n > 0) {
                    return n;
                } else {
                    System.err.println("Please enter the positive number ");

                }

            } catch (NumberFormatException ex) {
                System.err.println("Wrong format, please input an double");
                System.out.println("Please enter again: ");
            }

        }

    }

}
