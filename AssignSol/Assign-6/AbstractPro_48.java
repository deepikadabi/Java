import java.util.Scanner;

//48.Create an Abstract class Processor with int member variable data  and method showData to display data value.
//  Create abstract method process() to define processing of member data. 
// a. Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by 
//  overriding the process method. 
// b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding 
//  the process method.Ask user to enter choice (factorial or circle area).  Also ask data to work upon. 
//  Use Processor class reference to achieve this mechanism.

import java.util.Scanner;
abstract class Processor{
    int data;
    void showData(){
        System.out.print(data);
    }
    abstract void process(int n);
}

class Factorial extends Processor{
    void process(int n){
        int j=n;
        for(int i = n-1; i>0; i--){
            j*=i;
        }
        System.out.print("Factorial of "+n+" : ");
        data = j;
    }
}

class Circle extends Processor{
    void process(int n){
        data = (int)(3.14*n*n);
        System.out.print("Area of "+n+" : ");

    }
}
public class AbstractPro_48 {
    public static void main(String args[]){
        System.out.println("What do you want to Calculate Choose one option :  Area of Circle or Factorial : ");
        System.out.println("1. Area of Circle ");
        System.out.println("2. Factorial of a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number : ");
        int c = sc.nextInt();
        if(num == 1 ){
            Processor p = new Circle();
            p.process(c);
            p.showData();
        }
        if(num == 2){
            Processor f = new Factorial();
            f.process(c);
            f.showData();
        }

        
    }
}
