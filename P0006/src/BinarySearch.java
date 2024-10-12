
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dat
 */
public class BinarySearch {

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

    public static int Random() {
        Random ran = new Random();
        return ran.nextInt(10);

    }

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Random();
        }

    }

    public static void displayArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
        System.out.println(" ");
    }

    public static int binarySearch(int[] a, int key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                return 1;

            } else if (a[mid] < key) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of element of array: ");
        int n = checkInt();
        int[] a = new int[n];
        nhapMang(a);
        System.out.println("Enter the seach value: ");
        int key = checkInt();

        System.out.println("Sorted array: ");
        Arrays.sort(a);
        displayArray(a);
        
        if(binarySearch(a, key) == -1){
            System.out.println("Not Found!!");
        
        }else{
            for(int i=0;i<a.length;i++){
                if(key ==a[i]){
                    System.out.println("Found " + key + " at index: " + i);
                
                }
            }
        }
        

    }

}
