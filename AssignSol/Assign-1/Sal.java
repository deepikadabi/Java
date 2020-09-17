//In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then
// HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, 
//then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program 
//to find his gross salary. [ formula : GS= Basic + DA + HRA ]
import java.util.Scanner;
class Sal{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Salary : ");
    float f = sc.nextFloat();
    float hra=0;
    float da=0;
    if ( f<10000){
        hra = 10*f/100;
        da = 90*f/100;
    }
    else if( f >= 10000){
        hra = 20000;
        da = 98*f/100;
    }

    float gs = f+hra+da;
    System.out.println("Gross Salary : "+gs);
}
}