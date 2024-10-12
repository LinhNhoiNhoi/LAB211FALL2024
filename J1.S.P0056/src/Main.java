
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Main {

    

    public static void main(String[] args) {
        ArrayList<Worker> ls = new ArrayList<>();
        ArrayList<HistorySalary> lh = new ArrayList<>();
        int choise = 0;
        do {
            System.out.println("======== Worker Management =========");
            System.out.println("1. Add Worker.");
            System.out.println("2. Up Salary.");
            System.out.println("3. Decrease for worker.");
            System.out.println("4.Display Information salary");
            System.out.println("5.Exit.");
            System.out.println("====================================");
            choise = Checkin.checkInt();

            switch (choise) {
                case 1:
                    MyManager.AddWorker(ls);
                        break;
                        
                case 2:
                    MyManager.ChangeSlary(1,ls,lh);
                    break;  
                    
                    
                case 3:
                MyManager.ChangeSlary(2,ls,lh);
                break; 
                
                case 4:
                    MyManager.DisplaySalary(lh);
                    break;
            }
            
            
            
            

        } while (choise != 5);

    }
}
