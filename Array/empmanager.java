import java.io.*;
class Employee{
    private int id;
    private double salary;
    private String name,dept;
    double total;
    double sal=salary;
    public Employee(){
        id=0;
        salary=0.0;
        name=" ";
        dept=" ";
    }
    public Employee(int id,double salary, String name, String dept){
        this.id=id;
        this.salary=salary;
        this.name=name;
        this.dept=dept;
    }
    public void accept() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter id of employee: ");
        id=Integer.parseInt(br.readLine());
        System.out.println("Enter name of employee: ");
        name=br.readLine();
        System.out.println("Enter salary of employee: ");
        salary=Double.parseDouble(br.readLine());
        System.out.println("Enter department of employee: ");
        dept=br.readLine();
    }
    public double total(){
        total=total+salary;
        return total;
    }
    public void display(){
        System.out.println("Employee details are:");
        System.out.println("Emp Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+dept);   
    }
}
    
class Manager extends Employee{
    private double bonus;
    public void accept() throws IOException{
        super.accept();
        System.out.println("Enter Bonus of employee: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        bonus=Double.parseDouble(br.readLine());
        super.total=bonus;
    }
    public void display(){
        super.display();
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+total);
    } 
}
    
public class empmanager{ 
    public static void main(String[] args) throws IOException{
        Manager m=new Manager();
        
            m.accept();
            m.total();
       
            m.display();
            System.out.println("  ");
         }
}
