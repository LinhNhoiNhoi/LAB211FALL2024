
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
public class LinearSearch {
    private final static Scanner sc = new Scanner(System.in);
    
    public static int checkInput(){
        do {            
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if(n<=0){
                    System.err.println("Number need more than 0!");
                
                }else{
                    return n ;
                }
            } catch (NumberFormatException e) {
                 System.err.println("This is not positive number!!");
                 System.out.println("Please enter again: ");
            }
        } while (true);
    }
    
    public static int numRandom(){
        Random ran = new Random();
        return ran.nextInt(10);
    }
     public static void nhapMang(int []a){
         for(int i=0;i< a.length;i++){
             a[i] = numRandom();
         }    
     }
    public static void Print(int []a){
         for(int i=0;i< a.length;i++){
             System.out.print(a[i] + " ");
         }    
     }
    
    public static void LinearSearch(){
        
    
    
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Enter number of array: ");
        int n = checkInput();
        int []a = new int[n];
        System.out.println("Enter the seach of value");
        int num = checkInput();
        System.out.println("The array: ");
        nhapMang(a);
        Print(a);
    }
}
