//49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax(). 
//  a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. 
//  b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. 
//  c. Create class for main method(Say XYZ), accept employee information and a product information from user and 
//  print income tax and sales tax respectively.
import java.util.Scanner;
interface Taxable{
    int salesTax=7;
    double incomeTax = 10.5;
    abstract void calcTax();
}
class Employee implements Taxable{
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public void calcTax(){
       double incomeTax1 = salary * 10.5;
       System.out.println("Income tax is : "+incomeTax1);
    }
}

class Product implements Taxable{
    int pid;
    int price;
    int quantity;
    public void calcTax(){
        double salestax1 = price * 7;
       System.out.println("Sales tax is : "+salestax1);
    }

}
public class Interface_49 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee details : ");
        System.out.print("Employee ID : ");
        int empId = sc.nextInt();

        System.out.print("Employee Name : ");
        String eName = sc.next();

        System.out.print("Employee Salary : ");
        double eSal = sc.nextDouble();

        System.out.print("Product ID : ");
        int pid = sc.nextInt();

        System.out.print("Product Price : ");
        int price = sc.nextInt();

        System.out.print("Product Quantity : ");
        int qty = sc.nextInt();

        Employee e = new Employee(empId,eName,eSal);
        e.calcTax();


    }
}
