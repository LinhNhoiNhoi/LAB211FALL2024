
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class bubbleSort{

    private final static Scanner sc = new Scanner(System.in);

    //check input
    public static int checkInput() {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine().trim());

                if (num <= 0) {
                    System.err.println("Please enter input more than 0");

                } else {
                    return num;
                }

            } catch (NumberFormatException e) {
                System.err.println("This is not interger number");
                System.out.println("Please enter again ");
            }
        }

    }

    //lấy random các số 
    public static int numRandom() {
        Random ran = new Random();
        return ran.nextInt(10);
        // return ran.nextInt(10); có thể thay 10 bàng khoảng lớn hơn theo mong muốn nextint sẽ đến 2^32

    }

    //cho các số random vào arr
    public static void getRandom(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = numRandom();
            
        }
    }
    //in mang chua sap xep
    public static void printScreen(int []a){
        System.out.print("[");
        for(int i =0;i<a.length;i++){
            System.out.print( a[i]+ " ");
        
        }
        System.out.print("]");
    }

    //bubblesort arr
    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
           
        }

    }
     

    public static void main(String[] args) {
        System.out.println("Enter the number of array: ");    
        int num = checkInput();
        int []a = new int[num];
        
        
        
        System.out.println("Unsorted array: ");        
        getRandom(a);
        printScreen(a);
        
        
        System.out.println();
        System.out.println("Sorted array: ");
        
        
        bubbleSort(a);
        printScreen(a);
      
        
    }
}
