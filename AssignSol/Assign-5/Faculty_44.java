//	Create three classes
//-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId 
//  as input and another printSalary() to print salary.
import java.util.Scanner;
class Faculty{
    int facultyId;
    int salary;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Faculty ID : ");
        this.facultyId = sc.nextInt();
    }

    void print(){
        System.out.println(salary);
    }
}

//-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() 
//  method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary 
//  should not be accepted as input but should be calculated using formula (basicSalary + allowance)

class FullTimeFaculty extends Faculty{
    int basicSalary;
    int allowance;

    void input(){
        super.input();
        System.out.println("Enter Salary & Allowance : ");
        Scanner sc = new Scanner(System.in);
        this.basicSalary = sc.nextInt();
        this.allowance = sc.nextInt();
        salary = basicSalary+allowance;

    }
}

//-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() 
//  method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not 
//  be accepted as input but should be calculated using formula ( workingHour * ratePerHour )

class PartTimeFaculty extends Faculty{
    int workingHour;
    int ratePerHour;

    void input(){
        super.input();
        System.out.println("Enter Working Hours & Rate per Hours : ");
        Scanner sc = new Scanner(System.in);
        this.workingHour = sc.nextInt();
        this.ratePerHour = sc.nextInt();
        salary = workingHour*ratePerHour;

    }
}

public class Faculty_44 {
    public static void main(String args[]){
        System.out.println("For Part Time Faculty : ");
        Faculty p = new PartTimeFaculty();
        p.input();
        p.print();

        System.out.println("For Full Time Faculty : ");
        Faculty f = new FullTimeFaculty();
        f.input();
        f.print();
    }
}
