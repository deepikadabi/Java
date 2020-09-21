import java.util.Scanner;
class Employee{
    private int empId;
    private String empName;
    void set(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
        System.out.println(empId+" "+empName);
    }
}

class thiss{
    public static void main(String args[]){
        Employee e = new Employee();
        e.set(1000,"Deepika Dabi");
        e.show();
    }

}