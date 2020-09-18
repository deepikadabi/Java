//16.	Write a program to print table of any entered number using loop.
import java.util.Scanner;
class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int k = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(k+" x "+i+" = "+k*i);
        }
    }
}