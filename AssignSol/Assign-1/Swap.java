//Write a program to swap two numbers without using third variable.
import java.util.Scanner;
class Swap{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    b = (a+b)-(a=b);
    System.out.println(a+" "+b);
}}