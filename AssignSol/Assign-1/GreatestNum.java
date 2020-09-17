//Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator
// ( logical operator) ]  
import java.util.Scanner;
class GreatestNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int g = (a > b)?( (a>c ? a : c) ):( (b > c) ? b : c);
        System.out.println("Gretest Number : " +g); 
    }
}