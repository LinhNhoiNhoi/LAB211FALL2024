/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class HistorySalary extends Worker {

    private String Staus;
    private String date;

    public HistorySalary() {
    }

    public HistorySalary(String Staus, String date) {
        this.Staus = Staus;
        this.date = date;
    }

    public HistorySalary( String code, String name, int age, Double salary, String worklocation,String Staus, String date) {
        super(code, name, age, salary, worklocation);
        this.Staus = Staus;
        this.date = date;
    }
    

    public String getStaus() {
        return Staus;
    }

    public void setStaus(String Staus) {
        this.Staus = Staus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getWorklocation() {
        return worklocation;
    }

    public void setWorklocation(String worklocation) {
        this.worklocation = worklocation;
    }

    @Override
    public String toString() {
        return super.toString() + "Staus=" + Staus + ", date=" + date ;
    }

  
   
    
    
    

}
