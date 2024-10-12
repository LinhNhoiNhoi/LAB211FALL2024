
import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MyManager {

    public static void AddWorker(ArrayList<Worker> ls) {
        System.out.println("--------Add Worker--------");

        System.out.println("Enter Code: ");
        String code = Checkin.checkStringNull();
        if (!Checkin.checkDuplicated(code, ls)) {
            System.out.println("Code are Duplicated:  ");
            return;
        }

        System.out.println("Enter Name: ");
        String Name = Checkin.checkStringNull();

        System.out.println("Enter Age: ");
        int age = Checkin.checkAge();

        System.out.println("Enter Salary: ");
        double Salary = Checkin.checkDouble();

        System.out.println("Enter work Location: ");
        String Location = Checkin.checkStringNull();

        Worker work = new Worker(code, Name, age, Salary, Location);
        ls.add(work);
        System.out.println("Added Sucessfull!! ");
    }

    public static Worker getWokerByCode(ArrayList<Worker> ls, String code) {
        for (int i = 0; i < ls.size(); i++) {
            if (code.equalsIgnoreCase(ls.get(i).code)) {
                return ls.get(i);

            }

        }
        return null;
    }

    public static int getIndexWokerByCode(ArrayList<Worker> ls, String code) {
        for (int i = 0; i < ls.size(); i++) {
            if (code.equalsIgnoreCase(ls.get(i).code)) {
                return i;

            }

        }
        return -1;
    }

    public static String getDate() {
        DateFormat datefomat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return datefomat.format(calendar.getTime());
    }

    public static void ChangeSlary(int i, ArrayList<Worker> ls, ArrayList<HistorySalary> lh) {
        System.out.println("---------Up/Down Salary--------");
        System.out.println("Enter the Code: ");
        String code = Checkin.checkStringNull();

        if (Checkin.checkDuplicated(code, ls)) {
            System.out.println("Not Have Code in List ");
            return;
        }
        Worker worker = getWokerByCode(ls, code);
        double oldSalary = getWokerByCode(ls, code).getSalary();
        double newSalary;

        if (i == 1) {
            System.out.println("Enter new salary: ");
            while (true) {

                newSalary = Checkin.checkDouble();
                if (newSalary < oldSalary) {
                    System.out.println("Enter again salary: ");

                } else {

                    break;

                }

            }
            ls.get(getIndexWokerByCode(ls, code)).setSalary(newSalary);
            lh.add(new HistorySalary(worker.code, worker.name, worker.age, newSalary, worker.worklocation, "up", getDate()));
//            show(lh);
//            showWorker(ls);
            System.out.println("Updated Succesfull");

        }

        if (i == 2) {
            System.out.println("Enter new salary: ");
            while (true) {

                newSalary = Checkin.checkDouble();
                if (newSalary > oldSalary) {
                    System.out.println("Enter again salary: ");

                } else {

                    break;
                }
            }
            ls.get(getIndexWokerByCode(ls, code)).setSalary(newSalary);
            lh.add(new HistorySalary(worker.code, worker.name, worker.age, newSalary, worker.worklocation, "Down", getDate()));
//            show(lh);
            System.out.println("Updated Succesfull");

        }
    }

    public static void show(ArrayList<HistorySalary> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).toString());

        }

    }

    public static void showWorker(ArrayList<Worker> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).toString());

        }

    }

   public static void DisplaySalary(ArrayList<HistorySalary> lh) {
        System.out.println("--------------------------Display Information Salary-----------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","code", "Name", "Age", "Salary" ,"Status" ,"Date");
        for(HistorySalary a:lh){
            Displayhs(a);
        
        }
        
        
    }
   
   public static void Displayhs(HistorySalary a){
       System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", a.code,a.name,a.age,a.salary,a.getStaus(),a.getDate());
   
   
   }
   
   
}
