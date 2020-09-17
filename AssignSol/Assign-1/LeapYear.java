//Program to check that entered year is a leap year or not.
import java.util.Scanner;
class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y%100 !=0 && y%4 == 0 || y%400 == 0)
            System.out.println(y+" is Leap Year ");
        else
            System.out.println(y+" is Not A leap Year ");
    }
}