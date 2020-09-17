//Accept person’s gender (character m for male and f for female), 
//age (integer), as input and then check whether person is eligible for marriage or not.
import java.util.Scanner;
class Eligible{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gender : ");
        char g = sc.next().charAt(0);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        if( g=='f' && age > 18)
            System.out.println("You are eligible for marriage!");
        else if ( g=='m' && age > 22)
            System.out.println("You are eligible for marriage!");
        else
            System.out.println("You are not eligible for marriage!");
       
    }
}
