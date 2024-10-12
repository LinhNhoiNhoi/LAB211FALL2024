
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Fibonacci {
    private final static Scanner sc = new Scanner(System.in);
    
    public static int Fibonacci(int n) {
        do {
            try {
                if(n>=0){
                if (n == 0) {
                    return n;
                } else if (n == 1) {
                    
                    return n;
                } else {
                    return Fibonacci(n - 1) + Fibonacci(n - 2);
                }
                }
                else{
                    System.err.println("Không hợp lệ");
                }
            } catch (Exception e) {
                    System.err.println("Không hợp lệ");
            }

        } while (true);
    }
    
    
    public static int checkInput(){
       
        do {            
            try {
               int num = Integer.parseInt(sc.nextLine().trim());
               if(num<0){
                   System.err.print("Number errol");
                   System.out.println("Please enter the number again: ");
               
               }else{
                   return num;
               }
            } catch (NumberFormatException e) {
                 System.err.print("This is not interger number: ");
                 System.out.println("Please enter the number again: ");
            }
 
        } while (true);
    
    
    }
    
    
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = checkInput();
        System.out.println("The 45 sequence fibonacci: ");
        for(int i=0; i<=n;i++){
            System.out.print(Fibonacci(i) + ", ");
        }
    }
}
