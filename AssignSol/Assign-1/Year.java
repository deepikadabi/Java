//Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
//Now convert the entered days into complete years, months and days and print them.

import java.util.Scanner;
class Year{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Days : ");
        int d = sc.nextInt();
           int year = d/365;
            int rem = d%365;
               int month = rem/30;
                int days = rem%30;
         
        System.out.println(year +" year "+month+" month "+days+" days ");
    }
}
