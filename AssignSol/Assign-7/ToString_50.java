//50.	Explain the importance of toString() and equals() method of the Object class 
//  and override them on class Employee(empId,name,salary).  
// a. Create class for main method(say XYZ),and accept five employees information and store in an array. 
//  Also ensure if entered empId already exist or not (use equals method).  
//  b. Display all employee info using toString method.

import java.util.Scanner;
class Employee{
    int empId;
    String name;
    int salary;

    Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return empId+" "+name+" "+salary;
    }
}
class ToString{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[2];
        for(int i=0; i<2; i++){
            System.out.println("Enter value for : "+i);
            int k = sc.nextInt();
            String s = sc.next();
            int sa = sc.nextInt();
            Employee e = new Employee(k,s,sa);
            emp[i] = e;
        }

        for(Employee e : emp )
        System.out.println(e.toString());

    }
}
